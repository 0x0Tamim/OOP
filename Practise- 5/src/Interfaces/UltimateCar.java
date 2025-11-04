package Interfaces;

public class UltimateCar implements Brake {
    private Engine engine;
    private Media player;

    public UltimateCar(){
        engine = new PowerEngine();
        player = new CDplayer();
    }

    public UltimateCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void acc(){
        engine.acc();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }


    @Override
    public void brake() {
        System.out.println("Decreasing speed");
    }

    @Override
    public void stopBrake() {
        System.out.println("Increasing speed");
    }
}
