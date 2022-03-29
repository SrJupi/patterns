package n3.Vehicles;

public class Car implements IVehicle {
    @Override
    public void start() {
        System.out.println("Car Started");
    }

    @Override
    public void accelerate() {
        System.out.println("Car Accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Car Breaking");
    }
}
