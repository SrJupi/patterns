package n3.Vehicles;

public class Plane implements IVehicle {
    @Override
    public void start() {
        System.out.println("Plane Started");
    }

    @Override
    public void accelerate() {
        System.out.println("Plane Accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Plane Breaking");
    }
}
