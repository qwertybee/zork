package zork.command;

import zork.Game;

import java.util.List;

public interface Command {
    void execute(Game game, List<String> args);
    String getCommand();
    int numArgs(); // number of commands
}
