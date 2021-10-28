package BST_FAANG_QUESTIONS;

public class CeilingofNumber {
    public static void main(String[] args) {
        int[] arr = {3, 6, 10};
        int target = 7;
        System.out.println(ceilingNum(arr, target));
    }

    static int ceilingNum(int[] letters, int target){
        int start = 0;
        int end   = letters.length - 1;
        while (start <= end){
            int mid = (start+end)/2;
            if (target < mid){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
