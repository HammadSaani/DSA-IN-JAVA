package OPPRevision.Interface.CarExample;

public class Car implements Brake, Engine, Media {
    @Override
    public void brake() {
        System.out.println("I am Brake");
    }

    @Override
    public void start() {
        System.out.println("I am Starting");

    }

    @Override
    public void stop() {
        System.out.println("I am Stopping");

    }

    @Override
    public void acc() {
        System.out.println("I am Accelerating");
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.acc();
    }

}

