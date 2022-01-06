package OOP.OOP3;

public class AnotherExtend extends ExtendedBox{
    double price;
    AnotherExtend(){
        super();
        this.price = -1;
    }

    AnotherExtend (AnotherExtend other){
        super(other);
        this.weight = other.weight;
    }

    AnotherExtend (double l, double h, double w, double weight, double price){
        super(l, h, w, weight);
        this.price = price;
//        super(double l, double h, double w, double weight) ;
//        this.price = price;
    }
}
