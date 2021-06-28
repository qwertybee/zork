package zork.command;

import zork.Game;
import zork.character.Monster;
import zork.item.Item;

import java.util.List;

public class InspectCommand implements Command {

    @Override
    public void description() {
        System.out.println("Input usage: > inspect [insert item/monster]");
        System.out.println("Description: Inspects an item/monster from your inventory/area respectively.");
        System.out.println();
    }

    @Override
    public void execute(Game game, List<String> args) {
        String itemName = args.get(0).trim().toLowerCase();
        Monster monster = game.getCurrentArea().getMonster();
        Item item = game.getPlayer().getInventory().get(itemName);
        if (item != null && item.isItem(itemName)) {
            System.out.println(item.getDescription());
        }
        else if (monster!=null && monster.isMonster(itemName)) {
            System.out.println(monster.getDescription());
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
