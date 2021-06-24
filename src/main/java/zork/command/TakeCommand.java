package zork.command;

import zork.Game;

import java.util.List;

public class TakeCommand implements Command {

    @Override
    public void description() {
        System.out.println("Input usage: > take [insert item]");
        System.out.println("Description: Take item available in the room into inventory.");
        System.out.println();
    }

    @Override
    public void execute(Game game, List<String> args) {

    }

    @Override
    public String getCommand() {
        return "take";
    }

    @Override
    public int numArgs() {
        return 0;
    }
}
