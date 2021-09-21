package Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number One :");
        int numOne = in.nextInt();
        System.out.print("Enter Number Two:");
        int numTwo = in.nextInt();
        System.out.println("Sum of Numbers is :" + sum(numOne, numTwo));
    }
    static int sum(int a, int b){
        return a + b;
    }
}
