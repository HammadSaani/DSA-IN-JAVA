package AlgoExpert;

public class Two_ValidateSubsequence {
    public static void main(String[] args) {
        int[] arr = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] subArr = {1, 22, 5, 10};
        String a = "abc";
        String b = "abbacaa";
        System.out.println(isSubSequenceString(b, a));
        System.out.println(isSubsequence(arr, subArr));
    }

    public static boolean isSubsequence(int[] arr, int[] subArr){
        if (subArr.length == 0){
            return true;
        }
        int j = 0;
        for (int k : arr) {
            if (subArr[j] == k) {
                j++;
            }
            if (j == subArr.length) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSubSequenceString(String a, String b){
        if (b.length() == 0){
            return true;
        }
        int j=0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(j)){
                j++;
            }
            if (j == b.length()){
                return true;
            }
        }
        return false;
    }
}