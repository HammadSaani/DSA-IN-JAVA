package OOP.OOP3.Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circile circle = new Circile();
        Triangle triangle = new Triangle();
        Square square = new Square();

        shape.area();
        circle.area();
        triangle.area();
        square.area();
    }
}


// Compile Time/ Static Polymorphism:
// This is achieved by method overloading
// When a class have multiple methods with the same name. but types arguments ordering return type is different, Example constructor overloading
// Runtime/ Dynamic Polymorphism
// Achieved by Method overriding