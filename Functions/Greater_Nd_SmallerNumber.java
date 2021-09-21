package Functions;

import java.util.Scanner;
// This program will take two integers as input
// It will return max and min of given input

public class Greater_Nd_SmallerNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number One :");
        int one = in.nextInt();
        System.out.print("Enter Number Two :");
        int two = in.nextInt();
        System.out.println("Greater Number is :" + greater(one, two));
        System.out.println("Smaller Number is :" + smaller(one, two));
    }

    static int greater(int i, int ii) {
        return Math.max(i, ii);
    }
    static int smaller(int i, int ii){
        return Math.min(i, ii);
    }
}
