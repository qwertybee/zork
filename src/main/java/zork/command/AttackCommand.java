package zork.command;

import zork.Game;

import java.util.List;

public class AttackCommand implements Command {
    @Override
    public void description() {
        System.out.println("Input usage: > attack with [insert weapon name]");
        System.out.println("Description: Attacks foe with said weapon from inventory.");
        System.out.println();
    }

    @Override
    public void execute(Game game, List<String> args) {

    }

    @Override
    public String getCommand() {
        return "attack with";
    }

    @Override
    public int numArgs() {
        return 1;
    }
}
