import java.util.Scanner;

public class ViIIPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number :");
        int num = in.nextInt();
        System.out.print(isPrime(num));
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
