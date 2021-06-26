package zork;

import zork.character.Monster;

import java.util.stream.Collectors;

public class GameOutput {

    public void println(String message) {
        System.out.println(message);
    }

    public void printAvailableDirections(Game game) {
        System.out.print("Available directions:");
        System.out.println(game.getCurrentArea().getNeighbors().keySet().stream().collect(Collectors.toList()));
    }

    public void printLocation(Game game) {
        System.out.println("You are"+game.getCurrentArea().getDescription());
        System.out.println();
    }

    public void printInventory(Game game) {
        System.out.print("Your inventory:");
        System.out.println(game.getPlayer().getInventory().keySet().stream().collect(Collectors.toList()));
    }

    public void printRoomItems(Game game) {
        System.out.print("Items in the area:");
        System.out.println(game.getCurrentArea().getDroppedItems().keySet().stream().collect(Collectors.toList()));
    }

    public void printMonster(Game game) {
        Monster monster = game.getCurrentArea().getMonster();
        if (monster!=null) {
            System.out.println("A "+monster.getName()+" is in the area.");
            System.out.println(monster.getName()+": "+monster.getHealthPoints()+" out of "+monster.getMaxHealthPoints()+" HP.");
            }
        else {
            System.out.println("No monster in the area.");
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

}
