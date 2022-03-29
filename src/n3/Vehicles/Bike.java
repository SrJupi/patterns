package n3.Vehicles;

public class Bike implements IVehicle {
    @Override
    public void start() {
        System.out.println("Bike Started");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike Accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Bike Breaking");
    }
}
