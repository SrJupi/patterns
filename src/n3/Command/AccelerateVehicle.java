package n3.Command;

import n3.Vehicles.IVehicle;

public class AccelerateVehicle implements ICommand{
    private final IVehicle vehicle;

    public AccelerateVehicle(IVehicle vehicle){
        this.vehicle = vehicle;
    }
    
    @Override
    public void execute() {
        vehicle.accelerate();
    }
}
