package n3.Command;

import n3.Vehicles.IVehicle;

public class StopVehicle implements ICommand{
    private final IVehicle vehicle;

    public StopVehicle(IVehicle vehicle){
        this.vehicle = vehicle;
    }
    
    @Override
    public void execute() {
        vehicle.accelerate();
    }
}
