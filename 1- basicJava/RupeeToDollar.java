package basicJava;

import java.util.Scanner;

public class RupeeToDollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Currency in Rupee :");
        float rupee = input.nextInt();
        float dollar = rupee / 150;
        System.out.println("Value of Rupee in Dollar " + dollar);
    }
}
