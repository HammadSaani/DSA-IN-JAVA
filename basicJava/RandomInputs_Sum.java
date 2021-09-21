package basicJava;

import java.util.Scanner;

public class RandomInputs_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        while (true) {
            System.out.print("Enter Number :");
            int num = input.nextInt();
            if (num >= result){
                result = num;
            }
            if (num == 0){
                break;
            }
        }
        System.out.println("Sum of All Entered Numbers is " + result);
    }
}
