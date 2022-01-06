package OOP.OOP5;

public class Child extends Parent{
    @Override
    void career(String name){
        System.out.println("I am going to be " + name);
    }

    @Override
    void partner(String name, int age){
        System.out.println("I love " + name + " is of " + age);
    }
}
