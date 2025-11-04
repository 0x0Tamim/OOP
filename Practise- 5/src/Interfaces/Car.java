package Interfaces;

public class Car implements Engine,Brake,Media{


    @Override
    public void start() {
        System.out.println("i am starting like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("i am stoping like a normal car");

    }

    @Override
    public void acc() {

    }

    @Override
    public void brake() {
        System.out.println("i am braking like a normal car");

    }

    @Override
    public void stopBrake() {
        System.out.println("i am decreasing speed like a normal car");
    }
}
