package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayPractice {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int[][] twoD = new int[3][2];
        for (int i=0; i < twoD.length; i++){
            for (int j=0; j < twoD[i].length; j++){
                twoD[i][j] = in.nextInt();
            }
        }
        for (int[] ints : twoD) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
