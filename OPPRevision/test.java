package OPPRevision;

import java.util.Arrays;

public class test {

    public static void main(String args[]) {
        int [] arr = {1, 2, 3, 6, 5};
        System.out.println(sortedOrNot(arr));
        System.out.println(sortOrNotUsingRecursion(arr,0));
        System.out.println(max(arr, arr.length));
    }

    static int countZero(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 10 == 0) {
            count++;
        }
        return countZero(n / 10, count);
    }

    static boolean sortedOrNot(int[] arr) {
        int i = 0;
        int j = 1;
        while (j < arr.length) {
            if (arr[i] <= arr[j]) {
                i++;
                j++;
            }else {
                return false;
            }
        }
        return true;
    }

    static boolean sortOrNotUsingRecursion(int[] arr, int initializer){
        if (initializer > arr.length){
            return true;
        }
        if (arr[initializer] <= arr[initializer + 1]){
            return sortOrNotUsingRecursion(arr, initializer + 1);
        }
        return false;
    }

    static public int max(int[] arr, int index){
        int temp = arr[0];
        for (int i = 0; i < index; i++){
            if (temp <= arr[i]){
                temp = arr[i];

            }
        }
        return temp;
    }
}
