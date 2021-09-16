import java.util.Scanner;

public class VISix {
    public static void main(String[] args) {
        System.out.println(areaOfCircle());
    }
    static double areaOfCircle(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of radius :");
        int r = in.nextInt();
        return 3.14 * r * r;
    }
}
