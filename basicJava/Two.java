package basicJava;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give Input :");
        int num = input.nextInt();
        if (num % 2 == 0){
            System.out.print("Given Number is Even ");
        }else{
            System.out.println("Given Number is Odd ");
        }
    }
}
