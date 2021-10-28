package Functions;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[][] arr2d = {{0,1,1},{1,1,0},{0,1,0}};
        int[] arr = {0, 1, 0};
//        finalImage(arr2d);
        System.out.println(Arrays.toString(reverseImage(arr)));
    }

    static void print2d(int[][] arr){
        for (int row=0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }

    static void finalImage(int[][] arr){
        int[][] temp = arr;
        for (int row=0; row< temp.length; row++){
            reverseImage(temp[row]);
        }
        print2d(temp);
    }

    static int[] reverseImage(int[] arr) {
        int[] temp = arr;
//        temp[1] = 21;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                temp[arr.length -1 - i] = 0;
            }else{
                temp[arr.length -1 -i] = 1;

            }

        }
        return temp;

    }
}
