package AlgoExpert;
//https://leetcode.com/problems/squares-of-a-sorted-array/
import java.util.Arrays;

public class Three_SortedSquaredArray {
    public static void main(String[] args) {
        int[] arr = {-9, -6, -1, 2, 4, 12};
        System.out.println(Arrays.toString(sortedSquaredArray(arr)));

    }

    public static int[] sortedSquaredArray(int[] arr){
        int[] temp = new int[arr.length];
        int tempIndex = temp.length - 1;
        int i = 0;
        int j = arr.length - 1;
        while (i <= j){
            int left = arr[i] * arr[i];
            int right = arr[j] * arr[j];
            if (left > right){
                temp[tempIndex] = left;
                tempIndex--;
                i++;
            }else {
                temp[tempIndex] = right;
                tempIndex--;
                j--;
            }
        }
        return temp;
    }
}
