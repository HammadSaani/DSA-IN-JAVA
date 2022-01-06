package OPPRevision.Polymorphism;

public class Main {
    public static void main(String[] args) {

        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        int a = 10;
        int b = a;
        System.out.println(a == b);
//        System.out.println(a.equals(b));
    }
}
