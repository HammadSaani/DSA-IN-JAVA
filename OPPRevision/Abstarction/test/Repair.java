package OPPRevision.Abstarction.test;

public abstract class Repair {
    public static void repair(Object car){
        System.out.println("Car is Being Repaired");
        System.out.println("Done");
    }

    public static void main(String[] args) {
        Benx obj = new Benx();
//        Repair test = new Repair();
//        test.repair(obj);
        Repair.repair(obj);
    }
}
