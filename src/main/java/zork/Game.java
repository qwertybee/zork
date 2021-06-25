package zork;

import zork.area.Area;
import zork.area.CreateAreas;
import zork.character.CreateMonster;
import zork.character.Player;
import zork.command.Command;

import java.util.List;
import java.util.Scanner;

public class Game {

    private final GameOutput output = new GameOutput();
    private final CommandParser commandParser = new CommandParser();

    private Area currentArea;
    private final Player player = new Player();
    private final CreateAreas createAreas = new CreateAreas();
    private final CreateMonster createMonster  = new CreateMonster();

    public void run() {
        output.printWelcome();
        currentArea = createAreas.getAreaNeighbors().get("entrance");
        while(true) {
            output.printLocation(this);
            System.out.print("> ");
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            List<String> words = commandParser.parse(s);
            System.out.println(words);
            Command command = CommandFactory.get(words.get(0));
            if (command != null) {
                command.execute(this, words.subList(1, words.size()));
            }
        }
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
}
