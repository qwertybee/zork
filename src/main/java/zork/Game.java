package zork;

import zork.area.Area;
import zork.command.Command;

import java.util.List;
import java.util.Scanner;

public class Game {

    private Area currentArea;
    private final GameOutput output = new GameOutput();
    private final CommandParser commandParser = new CommandParser();

    public void run() {
        printWelcome();
        while(true) {
            System.out.print("> ");
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            List<String> words = commandParser.parse(s);
            Command command = CommandFactory.get(words.get(0));
            if (command != null) {
                command.execute(this, words.subList(1, words.size()));
            }
        }
    }

    public void printWelcome() {
        System.out.println("Welcome to a text-based game - a spin-off of Zork!");
        System.out.println();
        System.out.println();
        System.out.println("1938 A.D. Cairo, Egypt");
        System.out.println("Somewhere under a pyramid");
        System.out.println();
        System.out.println("You fell under the rubble while trying to find the entrance into the pyramid");
        System.out.println("\"Ugh!\", you groaned - feeling your head throbbing you tried to recall what you were doing here");
        System.out.println("\"Right...not only do I have find this treasure, I'm also stuck\"");
        System.out.println("You slowly stand up and notice that you are in front of what appears to be two giant obelisks");
        System.out.println("As the light slowly poured in above the rubble you notice the scale of the underground");
        System.out.println("Awestruck at the sheer magnitude of the area...");
        System.out.println("You slowly came to realization at what's in front of you...at what you were looking for all along...");
        System.out.println("THE VALLEY OF THE KINGS!!!!!");
        System.out.println();
        System.out.println();
        System.out.println("Type 'help' for available commands and its usages");
    }

    public GameOutput getOutput() {
        return output;
    }

    public void exit() {
        System.exit(0);
    }
}
