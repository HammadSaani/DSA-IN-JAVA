import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Starter:");
        int numOne = in.nextInt();
        System.out.print("Enter Last:");
        int numTwo = in.nextInt();
        primeNumbers(numOne, numTwo);

    }
    static void primeNumbers(int a, int b){
        for (int i=a; i <= b; i ++){
            if (isPrime(i)){
                System.out.print(i+ " ");
            }
        }
    }

    static boolean isPrime(int key){
        if (key <= 1){
            return false;
        }else{
            for (int i=2; i*i <= key; i++){
                if (key % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
