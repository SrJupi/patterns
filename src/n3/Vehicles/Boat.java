package n3.Vehicles;

public class Boat implements IVehicle {
    @Override
    public void start() {
        System.out.println("Boat Started");
    }

    @Override
    public void accelerate() {
        System.out.println("Boat Accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Boat Breaking");
    }
}
