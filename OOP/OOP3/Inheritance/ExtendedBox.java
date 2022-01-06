package OOP.OOP3;

public class ExtendedBox extends  Box{
    double weight;


    ExtendedBox (){
        super();
        this.weight = -1;
    }

    ExtendedBox ( ExtendedBox other){
        super(other);
        this.weight = other.weight;
    }

    ExtendedBox (double l, double h, double w, double weight){
        super(h, w, w);
        this.weight = weight;
    }

}
