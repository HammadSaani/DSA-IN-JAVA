//import java.util.Scanner;
//
//public class IVFour {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter Number One :");
//        int numOne = in.nextInt();
//        System.out.println("Enter Number Two:");
//        int numTwo = in.nextInt();
//        System.out.println(sum(numOne, numTwo));
//    }
//    static int sum(int a, int b){
//        return a + b;
//    }
//}
//

import java.util.Scanner;

public class IVFour {
    public static void main(String[] args) {
        System.out.println(sum());
    }
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number One :");
        int numOne = in.nextInt();
        System.out.println("Enter Number Two:");
        int numTwo = in.nextInt();
        return numOne + numTwo;
    }
}
