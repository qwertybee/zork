package zork;

import zork.command.Command;

import java.io.Serializable;
import java.util.*;

public class CommandParser implements Serializable {

    // "attack with weapon" -> ["attack with", "weapon"]
    // logic of splitting will be elsewhere
    public List<String> parse(String stringInput) {
        String cleanedInput = stringInput.trim().toLowerCase();
        String cmd = matchInputCommand(cleanedInput);
        Command command = CommandFactory.get(cmd);
        if (command!= null && command.numArgs() > 0) {
            String argString = cleanedInput.substring(cmd.length()).trim();
            return Arrays.asList(cmd, argString);
        }
        else {
            return Arrays.asList(cmd);
        }
    }

    private String matchInputCommand(String input) {
        List<String> temp = CommandFactory.getAllCommands();
        for (String command : temp) {
            if (input.startsWith(command)) {
                return command;
            }
        }
        System.out.println();
        System.out.println("Please enter valid command usage");
        System.out.println("Type 'help' for available commands and its usage");
        return null;
    }

}
