package basicJava;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1 :");
        int num1 = input.nextInt();
        System.out.print("Enter Number 2 :");
        int num2 = input.nextInt();
        System.out.print("Enter What you want to do with these numbers : + , - , / , * :");
        char operator = input.next().charAt(0);
        if (operator == '+') {
            int result = num1 + num2;
            System.out.println("Sum of Numbers is " + result);
        }else if (operator == '/'){
            int result = num1 / num2;
            System.out.println("Result is " + result);
        }else if (operator == '*'){
            int result = num1 * num2;
            System.out.println("Result is " + result);
        }else if (operator == '-'){
            int result = num1 - num2;
            System.out.println("Result is " + result);
        }
    }
}
