package basicJava;

import java.util.Scanner;

public class DivisorOFNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number :");
        int num = input.nextInt();
        System.out.print("Divisor of Number is/ are :");
        for (int i=1 ; i <= num ; i++){
            if (num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
