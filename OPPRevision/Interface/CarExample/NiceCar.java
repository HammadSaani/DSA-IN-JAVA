package OPPRevision.Interface.CarExample;

public class NiceCar {
    private Engine engine;
    private CDPlayer musciPlayer = new CDPlayer();

    NiceCar(){
        engine = new ElectricEngine();
    }


//    NiceCar(Engine engine){
//        this.engine = engine;
//    }
    void updradeEngine(Engine engine){
        this.engine = engine;
    }


    void start(){
        engine.start();
    }
    void stop(){
        engine.stop();
    }
    void acc(){
        engine.acc();
    }



    void musicStart(){
        musciPlayer.start();
    }


    void musicStop(){
        musciPlayer.stop();
    }

    public static void main(String[] args) {
        NiceCar car = new NiceCar();
        car.start();

    }
}
