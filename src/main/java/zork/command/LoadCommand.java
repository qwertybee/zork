package zork.command;

import zork.Game;
import zork.area.Area;

import java.io.*;
import java.util.List;

public class LoadCommand implements Command, Serializable {

    @Override
    public void description() {
        System.out.println("Input usage: > load [name]");
        System.out.println("Description: Load from your session's progress.");
        System.out.println();
    }

    @Override
    public void execute(Game game, List<String> args) {
        String savedProgressName = args.get(0);
        try {
            FileInputStream fileIn = new FileInputStream("C:/Users/Lily/Desktop/"+savedProgressName+".ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Game newGame = (Game) in.readObject();
            game.setCurrentArea((newGame.getCurrentArea()));
            game.setPlayer(newGame.getPlayer());
            game.setStartTime(newGame.getFinishTime());
            in.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getCommand() {
        return "load";
    }

    @Override
    public int numArgs() {
        return 1;
    }
}
