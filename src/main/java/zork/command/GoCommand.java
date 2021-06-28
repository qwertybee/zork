package zork.command;

import zork.Game;
import zork.area.Area;
import zork.character.CreateMonster;
import zork.character.Monster;
import zork.character.Mummy;

import java.io.Serializable;
import java.util.List;
import java.util.Random;

public class GoCommand implements Command {

    @Override
    public void description() {
        System.out.println("Input usage: > go [insert direction]");
        System.out.println("Description: Go towards a direction i.e. north, south, east, west, up, down");
        System.out.println();
    }

    @Override
    public void execute(Game game, List<String> args) {
        String direction = args.get(0).trim();
        boolean containDirection = game.getCurrentArea().hasNeighbor(direction);
        if (containDirection) {
            String newArea = game.getCurrentArea().getNeighbors().get(direction);
            Area newAreaReference = game.getCreateAreas().getAreaNeighbors().get(newArea);
            switch (direction) {
                case "north":
                    game.setCurrentArea(newAreaReference);
                    break;
                case "south":
                    game.setCurrentArea(newAreaReference);
                    break;
                case "east":
                    game.setCurrentArea(newAreaReference);
                    break;
                case "west":
                    game.setCurrentArea(newAreaReference);
                    break;
                case "down":
                    game.setCurrentArea(newAreaReference);
                    break;
                case "up":
                    game.setCurrentArea(newAreaReference);
                    break;

            }
            // regenerate
            int playerHealthPoints = game.getPlayer().getHealthPoints();
            game.getPlayer().setHealthPoints(playerHealthPoints+5);
            // spawn monster
            Monster randomMonster = game.getCreateMonster().createMonster(game);
            newAreaReference.spawnMonster(randomMonster);
        }
        else {
            System.out.println();
            System.out.println("'go' where? Please insert available directions.");
            System.out.println("Type 'help' for commands and its usage.");
        }
    }

    @Override
    public String getCommand() {
        return "go";
    }

    @Override
    public int numArgs() {
        return 1;
    }
}
