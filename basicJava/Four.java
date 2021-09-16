package basicJava;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal :");
        int Principal = input.nextInt();
        System.out.print("Enter Time :");
        int Time = input.nextInt();
        System.out.print("Enter Rate :");
        double Rate = input.nextDouble();

        double result = (Principal * Time * Rate) / 100;
        System.out.println("Here is Your Interest :"+ result);
    }
}
