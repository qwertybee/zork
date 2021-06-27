package zork.command;

import zork.Game;
import zork.item.Item;

import java.util.List;

public class InsertCommand implements Command {

    @Override
    public void description() {
        System.out.println("Input usage: > insert [insert item]");
        System.out.println("Description: Inserts item into places.");
        System.out.println();
    }

    @Override
    public void execute(Game game, List<String> args) {
        String itemName = args.get(0).trim();
        Item item = game.getPlayer().getInventory().get(itemName);
        String areaName = game.getCurrentArea().getName();
        if (item!=null && item.getType().equals("Stone") && areaName.equals("tomb")) {
            game.getCurrentArea().getStonesOnWall().put(itemName, item);
            System.out.println();
            System.out.println("You filled the "+itemName+" into the mural!");
            int stonesLeft = 3-game.getCurrentArea().getStonesOnWall().size();
            if (game.getCurrentArea().getStonesOnWall().size()==3) {
                System.out.println();
                System.out.println("You've successfully filled all the stones!");
                game.getOutput().printEnding(game);
            }
            else {
                System.out.println("There are "+stonesLeft+" left to be filled!");
            }
        }
        else {
            System.out.println();
            System.out.println("No such item to insert.");
            System.out.println("Type 'help' for available commands and its usage.");
        }
    }

    @Override
    public String getCommand() {
        return "insert";
    }

    @Override
    public int numArgs() {
        return 1;
    }

}
