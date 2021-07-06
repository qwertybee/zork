package zork.command;

import zork.Game;
import zork.area.Map;

import java.util.List;

public class MapCommand implements Command {

    @Override
    public void description() {
        System.out.println("Input usage: > map");
        System.out.println("Description: Shows area of the palace.");
        System.out.println();
    }

    @Override
    public void execute(Game game, List<String> args) {
        Map.readMap();
    }

    @Override
    public String getCommand() {
        return "map";
    }

    @Override
    public int numArgs() {
        return 0;
    }
}
