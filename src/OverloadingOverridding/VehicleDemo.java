package OverloadingOverridding;

/*In Vehicle hierarchy, add methods like start and stop in Vehicle and override them in Child classes*/


class Vehicle{
    public void start(){
        System.out.println("Vehicle started");
    }
    public void stop(){
        System.out.println("Vehivle stopped");
    }
}
class Car extends Vehicle{
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car Stopped");
    }
}
class Bike extends Vehicle{
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void stop() {
        System.out.println("Bike Stopped");
    }
}
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car=new Car();
        car.start();
        car.stop();
        Vehicle bike=new Vehicle();
        bike.start();
        bike.stop();
    }
}
