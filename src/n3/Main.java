package n3;

import n3.Command.AccelerateVehicle;
import n3.Command.StartVehicle;
import n3.Command.StopVehicle;
import n3.Vehicles.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <IVehicle> vehiclesList = new ArrayList<>();
        vehiclesList.add(new Bike());
        vehiclesList.add(new Boat());
        vehiclesList.add(new Car());
        vehiclesList.add(new Plane());

        ActionInvoker actionInvoker = new ActionInvoker();

        for (IVehicle vehicle :
                vehiclesList) {
            StartVehicle startVehicle = new StartVehicle(vehicle);
            AccelerateVehicle accelerateVehicle = new AccelerateVehicle(vehicle);
            StopVehicle stopVehicle = new StopVehicle(vehicle);
            actionInvoker.getActions(startVehicle);
            actionInvoker.getActions(accelerateVehicle);
            actionInvoker.getActions(stopVehicle);
        }

        actionInvoker.executeActions();
    }
}
