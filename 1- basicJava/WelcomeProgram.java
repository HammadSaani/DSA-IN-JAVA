package basicJava;

import java.util.Scanner;

public class WelcomeProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name :");
        String name = input.nextLine();
        System.out.print("Welcome to my Java  World, " + name);
    }
}
