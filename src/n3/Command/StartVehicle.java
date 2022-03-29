package n3.Command;

import n3.Vehicles.IVehicle;

public class StartVehicle implements ICommand{
    private final IVehicle vehicle;

    public StartVehicle (IVehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.start();
    }
}
