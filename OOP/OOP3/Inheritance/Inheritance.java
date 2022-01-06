package OOP.OOP3;

public class Inheritance {
    public static void main(String[] args) {
//        Box box = new Box(4);
//        Box testBox = new Box(box);
//        System.out.println(box.h);
//        System.out.println(box.l);
//        System.out.println(box.w);
//        ExtendedBox boxnew = new ExtendedBox(1, 2, 3, 4);
//        System.out.println(boxnew.h + " " + boxnew.w + " " + boxnew.weight + " " + boxnew.l);

//        ExtendedBox weird = new Box(1, 2, 3, 2);
//
//        Box weird = new ExtendedBox(1, 2, 3, 4);
//        System.out.println(weird.h + " " + weird.w + " " + weird.l + " ");

        AnotherExtend obj = new AnotherExtend();
        AnotherExtend objobj = new AnotherExtend(obj);

    }
}
