package OPPRevision.Inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box(double side){
        this.l = side;
        this.w = side;
    }

    Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box (Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
}
