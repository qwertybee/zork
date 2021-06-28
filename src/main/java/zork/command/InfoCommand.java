package zork.command;

import zork.Game;
import zork.area.Area;
import zork.character.Player;

import java.io.Serializable;
import java.util.List;

public class InfoCommand implements Command {

    @Override
    public void description() {
        System.out.println("Input usage: > info");
        System.out.println("Description: Prints out information about player and the room they're currently in.");
        System.out.println("- Player stats, e.g. HP/HP Max, attack power, etc.");
        System.out.println("- Room information, e.g. Monster stats (if any), item stats (if any), doors, etc.");
        System.out.println();
    }

    @Override
    public void execute(Game game, List<String> args) {
        Area currentArea = game.getCurrentArea();
        Player player = game.getPlayer();
        System.out.println("Player info:");
        System.out.println("- "+player.getHealthPoints()+" out of "+player.getMaxHealthPoints()+" HP.");
        System.out.println();
        System.out.println("Room info:");
        System.out.println("- You are"+currentArea.getDescription());
        System.out.println("- Item(s) in area:"+currentArea.getDroppedItems());
        System.out.println();
        System.out.println("Monster in area info:");
        System.out.println("- "+currentArea.getMonster().getName()+": "
                +currentArea.getMonster().getHealthPoints()+" out of "+currentArea.getMonster().getMaxHealthPoints()+" HP.");
    }

    @Override
    public String getCommand() {
        return "info";
    }

    @Override
    public int numArgs() {
        return 0;
    }
}
