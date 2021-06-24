package zork.command;

import zork.Game;

import java.util.List;

public class DropCommand implements Command {

    @Override
    public void description() {
        System.out.println("Input usage: > drop [insert item name]");
        System.out.println("Description: Drops said item from inventory.");
        System.out.println();
    }

    @Override
    public void execute(Game game, List<String> args) {

    }

    @Override
    public String getCommand() {
        return "drop";
    }

    @Override
    public int numArgs() {
        return 0;
    }
}
