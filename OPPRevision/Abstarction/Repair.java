package OPPRevision.Abstarction;

public class Repair {

    public static void repair(Car car){
        System.out.println("Car is Repaired");
    }


    public static void main(String[] args) {
        WagnoR wagnoR = new WagnoR();
        Audi audi = new Audi();
        repair(wagnoR);
        repair(audi);
    }
}
