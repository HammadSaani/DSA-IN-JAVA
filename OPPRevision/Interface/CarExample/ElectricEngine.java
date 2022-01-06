package OPPRevision.Interface.CarExample;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine Starting");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stopping");
    }

    @Override
    public void acc() {
        System.out.println("Electric Engine Accelerating");
    }
}
