package Functions;

import java.util.Scanner;

public class Eligible_Not_Eligible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Age :");
        int age = in.nextInt();
        if (isEligible(age)){
            System.out.println("Eligible");
        } else{
            System.out.println("Not Eligible");
        }

    }
    static boolean isEligible(int i){
        return i >= 18;
    }
}
