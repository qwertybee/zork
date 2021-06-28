package zork.command;

import zork.CommandFactory;
import zork.Game;

import java.io.Serializable;
import java.util.List;

public class HelpCommand implements Command {

    @Override
    public void description() {
        System.out.println("Input usage: > help");
        System.out.println("Description: List all of the available commands and how to use them.");
        System.out.println();
    }

    @Override
    public void execute(Game game, List<String> args) {
        System.out.println("AVAILABLE COMMANDS AND ITS USAGE");
        System.out.println();
        for (String command : CommandFactory.getAllCommands()) {
            System.out.println(command.toUpperCase());
            CommandFactory.get(command).description();
        }
    }

    @Override
    public String getCommand() {
        return "help";
    }

    @Override
    public int numArgs() {
        return 0;
    }
}
