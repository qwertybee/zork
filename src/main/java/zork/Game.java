package zork;

import zork.area.Area;
import zork.area.CreateAreas;
import zork.character.CreateMonster;
import zork.character.Player;
import zork.command.Command;
import zork.item.CreateStone;

import java.util.List;
import java.util.Scanner;

public class Game {

    private final GameOutput output = new GameOutput();
    private final CommandParser commandParser = new CommandParser();
    private long startTime;

    private Area currentArea;
    private final Player player = new Player();
    private final CreateAreas createAreas = new CreateAreas();
    private final CreateMonster createMonster  = new CreateMonster();
    private final CreateStone createStone = new CreateStone();

    public void run() {
        output.printWelcome();
        currentArea = createAreas.getAreaNeighbors().get("entrance");
        startTime = System.currentTimeMillis();
        while (true) {
            output.printLocation(this);
            output.printAvailableDirections(this);
            output.printInventory(this);
            output.printPlayer(this);
            output.printRoomItems(this);
            System.out.println();
            output.printMonster(this);
            System.out.print("> ");
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            List<String> words = commandParser.parse(s);
            Command command = CommandFactory.get(words.get(0));
            if (command != null) {
                command.execute(this, words.subList(1, words.size()));
            }
            System.out.println();
        }
    }

    public long getStartTime() {
        return startTime;
    }

    public void setCurrentArea(Area newArea) {
        currentArea = newArea;
    }

    public Area getCurrentArea() {
        return currentArea;
    }

    public Player getPlayer() {
        return player;
    }

    public CreateAreas getCreateAreas() {
        return createAreas;
    }

    public GameOutput getOutput() {
        return output;
    }

    public void exit() {
        System.exit(0);
    }

    public CreateMonster getCreateMonster() {
        return createMonster;
    }

    public CreateStone getCreateStone() {
        return createStone;
    }

}
