package OOP.OOP6Interface;

public class Main {
    public static void main(String[] args) {

//        The line written below means that we can access the functions/methods that are in Engine but as they are overridden in Car Class as well. Then, the function that are in Engine will be executed but body of that functions will be taken from Class Car.
        Engine car = new Car();
    }
}
