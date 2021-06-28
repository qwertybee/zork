package zork.command;

import zork.Game;

import java.io.Serializable;
import java.util.List;

public class QuitCommand implements Command, Serializable {
    @Override
    public void description() {
        System.out.println("Input usage: > quit");
        System.out.println("Description: End current game and return to welcome page.");
        System.out.println();
    }

    @Override
    public void execute(Game game, List<String> args) {
        System.out.println();
        System.out.println("Exit current game. Back to welcome page.");
        System.out.println();
        System.out.println();
        game.run();
    }

    @Override
    public String getCommand() {
        return "quit";
    }

    @Override
    public int numArgs() {
        return 0;
    }
}
