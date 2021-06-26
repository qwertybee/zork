package zork.command;

import zork.Game;
import zork.item.Item;

import java.util.HashMap;
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
        String itemName = args.get(0);
        HashMap<String, Item> inventory = game.getPlayer().getInventory();
        HashMap<String, Item> droppedItems = game.getCurrentArea().getDroppedItems();
        Item item = inventory.get(itemName);
        if (item != null) {
            droppedItems.put(itemName, item);
            inventory.remove(itemName);
            System.out.println(itemName+" dropped.");
        }
        else {
            System.out.println();
            System.out.println("'drop' what? Please insert available item from inventory.");
            System.out.println("Type 'help' for commands and its usage.");
            System.out.println();
        }
    }

    @Override
    public String getCommand() {
        return "drop";
    }

    @Override
    public int numArgs() {
        return 1;
    }
}
