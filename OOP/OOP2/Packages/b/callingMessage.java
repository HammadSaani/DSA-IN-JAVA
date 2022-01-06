package OOP.OOP2.Packages.b;

import static OOP.OOP2.Packages.a.Message.message;

public class callingMessage {
    public static void main(String[] args) {
        System.out.println("Calling from b");
        message();
    }
}
