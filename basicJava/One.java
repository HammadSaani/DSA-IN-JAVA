// Factorial of Given Number
package basicJava;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number :");
        int num = input.nextInt();
        int temp = 1;
        int count = num;
        for (int i = 0; i < count ; i++){
            temp *= num;
            num -= 1;
        }
        System.out.println("Factorial of Given Number is :" +temp);
    }
}


// We can done it through while loops as well