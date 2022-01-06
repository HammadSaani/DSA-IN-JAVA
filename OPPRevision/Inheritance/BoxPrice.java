package OPPRevision.Inheritance;

public class BoxPrice extends BoxWeight {
    double price;

    BoxPrice(){
        super();
        this.price = -1;
    }

    BoxPrice(double p){
        this.price = p;
    }

    BoxPrice(double w, double l, double h, double weight, double p){
        super(w, l, h, weight);
        this.price = p;
    }
}
