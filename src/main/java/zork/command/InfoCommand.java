package zork.command;

import zork.Game;

import java.util.List;

public class InfoCommand implements Command {

    @Override
    public void description() {
        System.out.println("Input usage: > info");
        System.out.println("Description: Prints out information about player and the room they're currently in.");
        System.out.println("- Player stats, e.g. HP/HP Max, attack power, etc.");
        System.out.println("- Room information, e.g. Monster stats (if any), item stats (if any), doors, etc.");
        System.out.println();
    }

    @Override
    public void execute(Game game, List<String> args) {

    }

    @Override
    public String getCommand() {
        return "info";
    }

    @Override
    public int numArgs() {
        return 0;
    }
}
