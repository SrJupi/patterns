package n1;

import java.util.Stack;

public class Undo {

    private static Undo instance;
    private Stack <String> undoStack;
    private Stack <String> redoStack;
    private String tmp;
    private String currentAction;

    private Undo(){
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }


    public static Undo getInstance() {
        if (instance == null){
            instance = new Undo();
        }
        return instance;
    }

    public void getInfo(){
        System.out.print("current action: ");
        System.out.println(currentAction);
        System.out.print("undo stack: ");
        System.out.println(undoStack);
        System.out.print("redo stack: ");
        System.out.println(redoStack);
    }

    public void push (String s) {
        if (!redoStack.isEmpty()){
            redoStack = new Stack<>();
        }
        undoStack.push(s);
        currentAction = s;
        executeAction();
    }

    public void executeAction() {
        if (currentAction != null){
            System.out.println("executing: " + currentAction);
        }else{
            System.out.println("action not selected");
        }
    }

    public void undo () {
        if(!undoStack.isEmpty()){
            tmp = undoStack.pop();
            redoStack.push(tmp);
            getCurrentAction();
            System.out.println("undone action: "+ tmp + "\ncurrent action: " + currentAction);
        }else{
            System.out.println("Cannot undo anymore!");
        }
    }

    public void redo () {
        if (!redoStack.isEmpty()){
            tmp = redoStack.pop();
            undoStack.push(tmp);
            getCurrentAction();
            System.out.println("redone action: "+ tmp + "\ncurrent action: " + currentAction);
        }else{
            System.out.println("Cannot redo anymore!");
        }
    }

    public void getCurrentAction () {
        try{
            currentAction = undoStack.peek();
        }catch (Exception e) {
            currentAction = null;
        }
    }
}
