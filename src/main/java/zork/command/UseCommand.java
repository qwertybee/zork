package zork.command;

import zork.Game;
import zork.item.Item;

import java.util.List;

public class UseCommand implements Command {

    @Override
    public void description() {
        System.out.println("Input usage: > use [insert item]");
        System.out.println("Description: Use an item (except weapon).");
        System.out.println();
    }

    @Override
    public void execute(Game game, List<String> args) {
        String itemName = args.get(0).trim();
        Item item = game.getPlayer().getInventory().get(itemName);
        if (item != null && item.getType().equals("Edible")) {
            game.getPlayer().setHealthPoints(100);
            game.getPlayer().getInventory().remove(itemName);
            System.out.println();
            System.out.println("Player now in full health!");
        }
        else {
            System.out.println();
            System.out.println("Cannot 'use' such item.");
            System.out.println("Type 'help' for available commands and its usage.");
        }
    }

    @Override
    public String getCommand() {
        return "use";
    }

    @Override
    public int numArgs() {
        return 1;
    }
}
