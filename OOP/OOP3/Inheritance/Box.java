package OOP.OOP3;

public class Box {
    double l;
    double w;
    double h;

    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double h, double w, double l){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    void display(){
        System.out.println("Running the box");
    }

}
