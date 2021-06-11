package zork;

import zork.command.Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandParser {

    // sort command by length
    private List<String> allCommmandsSortedByLength = new ArrayList<>();
    {
        allCommmandsSortedByLength.addAll(CommandFactory.getAllCommands());
        allCommmandsSortedByLength.sort((o1, o2) -> o2.length() - o1.length());
    }

    private String matchInputCommand(String input) {
        for (String command : allCommmandsSortedByLength){
            if (input.startsWith(command)) {
                return command;
            }
        }
        return null;
    }

    // "attack with weapon" -> ["attack with", "weapon"]
    // logic of splitting will be elsewhere
    public List<String> parse(String stringInput) {
        String cleanedInput = stringInput.trim();
        String cmd = matchInputCommand(cleanedInput);
        Command command = CommandFactory.get(cmd);
        if (command.numArgs() > 0) {
            String argString = cleanedInput.substring(cmd.length());
            return Arrays.asList(cmd, argString);
        }
        else {
            return Arrays.asList(cmd);
        }
        //do some checking for space later
        //and handle invalid number of argument i.e. just exit
    }
}
