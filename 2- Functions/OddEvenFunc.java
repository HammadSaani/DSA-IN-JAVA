package Functions;

import java.util.Scanner;

public class OddEvenFunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number :");
        int one = in.nextInt();
        if (isEven(one)){
            System.out.println("Number is Even");
        } else{
            System.out.println("Number is Odd");
        }

    }
    static boolean isEven(int i){
        return i % 2 == 0;
    }
}
