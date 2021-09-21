package Functions;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        System.out.println(multiply());
    }
    static int multiply(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number One :");
        int numOne = in.nextInt();
        System.out.print("Enter Number Two:");
        int numTwo = in.nextInt();
        return numOne * numTwo;
    }
}
