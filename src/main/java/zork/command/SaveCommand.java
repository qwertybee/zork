package zork.command;

import zork.Game;

import java.io.*;
import java.util.List;

public class SaveCommand implements Command {
    @Override
    public void description() {
        System.out.println("Input usage: > save [name]");
        System.out.println("Description: Save your session's current progress.");
        System.out.println();
    }

    @Override
    public void execute(Game game, List<String> args) {
        String nameProgress = args.get(0).trim();
        try {
            FileOutputStream fileOut = new FileOutputStream("C:/Users/Lily/Desktop/"+nameProgress+".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(game);
            out.close();
            fileOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getCommand() {
        return "save";
    }

    @Override
    public int numArgs() {
        return 1;
    }
}
