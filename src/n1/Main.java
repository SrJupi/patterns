package n1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Undo u = Undo.getInstance();
        Scanner sc = new Scanner(System.in);
        boolean isFinished = false;
        System.out.println("System commands: undo, redo, info, exe, exit");
        System.out.println("Insert command: ");
        while (!isFinished){

            System.out.print("> ");
            String tmp = sc.nextLine();
            switch (tmp) {
                case "":
                    System.out.println("action not selected");
                    break;
                case "exit":
                    System.out.println("Program is finishing...");
                    u.getInfo();
                    isFinished = true;
                    break;
                case "undo":
                    u.undo();
                    break;
                case "redo":
                    u.redo();
                    break;
                case "info":
                    u.getInfo();
                    break;
                case "exe":
                    u.executeAction();
                    break;
                default:
                    u.push(tmp);
            }
        }
    }
}