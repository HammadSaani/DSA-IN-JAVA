package basicJava;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number :");
        int numOne = input.nextInt();
        System.out.print("Enter Second Number :");
        int numTwo = input.nextInt();
        if (numOne > numTwo){
            System.out.println("Greater Number is "+ numOne);
        }else{
            System.out.println("Greater Number is "+ numTwo);
        }
    }
}
