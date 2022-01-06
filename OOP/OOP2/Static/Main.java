package OOP.OOP2.Static;

public class Main {
    public static void main(String[] args) {
        fun();
    }
    static void fun(){
        System.out.println("Hi, I am fun()");
        Main obj = new Main();
        obj.fun2();
    }

    void greeting(){
        System.out.println("Hi, I am greeting()");
    }

    void fun2(){
        System.out.println("Hi, I am fun2() calling greeting()");
        greeting();
    }
}
