package zork;

import zork.command.Command;

import java.util.*;

public class CommandParser {

    // "attack with weapon" -> ["attack with", "weapon"]
    // logic of splitting will be elsewhere
    public List<String> parse(String stringInput) {
        String cleanedInput = stringInput.trim().toLowerCase();
        String cmd = matchInputCommand(cleanedInput);
        Command command = CommandFactory.get(cmd);
        if (command.numArgs() > 0) {
            String argString = cleanedInput.substring(cmd.length()).trim();
            return Arrays.asList(cmd, argString);
        }
        else {
            return Arrays.asList(cmd);
        }
        //do some checking for space later
        //and handle invalid number of argument i.e. just exit
    }

    private String matchInputCommand(String input) {
        List<String> temp = CommandFactory.getAllCommands();
        for (String command : temp) {
            if (input.startsWith(command)) {
                return command;
            }
        }
        return null;
    }

    //    // sort command by length
//    private List<String> allCommmandsSortedByLength = new ArrayList<>();
//    {
//        allCommmandsSortedByLength.addAll(CommandFactory.getAllCommands());
//        System.out.println(allCommmandsSortedByLength);
//        allCommmandsSortedByLength.sort((o1, o2) -> o2.length() - o1.length());
//    }

}
