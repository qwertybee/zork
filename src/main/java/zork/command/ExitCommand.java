package zork.command;

import zork.Game;

import java.io.Serializable;
import java.util.List;

public class ExitCommand implements Command {

    @Override
    public void description() {
        System.out.println("Input usage: > exit");
        System.out.println("Description: Exits the game.");
        System.out.println();
    }

    @Override
    public void execute(Game game, List<String> args) {
        game.getOutput().println("Exit game");
        game.exit();
    }

    @Override
    public String getCommand() {
        return "exit";
    }

    @Override
    public int numArgs() {
        return 0;
    }
}
