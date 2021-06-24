package zork.command;

import zork.Game;

import java.util.List;

public class GoCommand implements Command {
    @Override
    public void description() {
        System.out.println("Input usage: > go [insert direction]");
        System.out.println("Description: Go towards a direction i.e. north, south, east, west");
        System.out.println();
    }

    @Override
    public void execute(Game game, List<String> args) {

    }

    @Override
    public String getCommand() {
        return "go";
    }

    @Override
    public int numArgs() {
        return 0;
    }
}
