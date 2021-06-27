package zork.command;

import zork.Game;
import zork.item.Item;

import java.util.List;

public class InspectCommand implements Command {

    @Override
    public void description() {
        System.out.println("Input usage: > inspect [insert item]");
        System.out.println("Description: Inspects an item from your inventory.");
        System.out.println();
    }

    @Override
    public void execute(Game game, List<String> args) {
        String itemName = args.get(0).trim();
        Item item = game.getPlayer().getInventory().get(itemName);
        if (item != null) {
            System.out.println(item.getDescription());
        }
        else {
            System.out.println();
            System.out.println("No such item in your inventory.");
        }
    }

    @Override
    public String getCommand() {
        return "inspect";
    }

    @Override
    public int numArgs() {
        return 1;
    }
}
