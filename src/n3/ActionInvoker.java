package n3;

import n3.Command.ICommand;

import java.util.ArrayList;

public class ActionInvoker {
    private final ArrayList<ICommand> actionsList = new ArrayList<>();

    public void getActions (ICommand action){
        actionsList.add(action);
    }

    public void executeActions (){
        for (ICommand action : actionsList){
            action.execute();
        }
        actionsList.clear();
    }
}
