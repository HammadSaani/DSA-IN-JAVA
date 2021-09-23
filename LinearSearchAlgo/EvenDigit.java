package LinearSearchAlgo;

public class EvenDigit {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));

    }
    static public int findNumbers(int[] arr) {
        int count = 0;
        for(int i: arr){
            String num = (String.valueOf(i));
            if (even(num)){
                count++;
            }
        }


        return count;
    }

    static boolean even(String num) {
        return num.length() % 2 == 0;
    }
}
