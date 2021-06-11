package zork.command;

import zork.Game;

import java.util.List;

public class ExitCommand implements Command{

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
