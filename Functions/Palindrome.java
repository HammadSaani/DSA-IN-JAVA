package Functions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number :");
        int num = in.nextInt();
        System.out.println(isPalindrome(num));
    }
    static boolean isPalindrome(int a){
        int num = a;
        int temp = 0;
        while (a != 0){
            temp = (temp * 10) + (a % 10);
            a = a / 10;
        }
        return temp == num;
    }
}
