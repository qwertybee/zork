package zork.command;

import zork.Game;
import zork.item.Item;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

public class TakeCommand implements Command, Serializable {

    @Override
    public void description() {
        System.out.println("Input usage: > take [insert item]");
        System.out.println("Description: Take item available in the room into inventory.");
        System.out.println();
    }

    @Override
    public void execute(Game game, List<String> args) {
        String itemName = args.get(0).trim().toLowerCase();
        HashMap<String, Item> droppedItems = game.getCurrentArea().getDroppedItems();
        Item item = droppedItems.get(itemName);
        if (item != null) {
            game.getPlayer().getInventory().put(itemName, item);
            droppedItems.remove(itemName, item);
            System.out.println();
            System.out.println(itemName+" taken.");
        }
        else {
            System.out.println();
            System.out.println("No such item to be taken.");
        }
    }

    @Override
    public String getCommand() {
        return "take";
    }

    @Override
    public int numArgs() {
        return 1;
    }
}
