package zork.area;

import zork.character.Monster;
import zork.item.Item;

import java.util.ArrayList;
import java.util.HashMap;

public class Area {

    private final String name;
    private final String description;
    private HashMap<String, String> neighbors;
    private Monster monster;

    public void spawnMonster(Monster monster) {
        this.monster = monster;
    }

    public Area(String name, String description) {
        this.name = name;
        this.description = description;
        this.neighbors = new HashMap<>();
    }

    public void setNeighbor(String direction, String neighbor) {
        neighbors.put(direction, neighbor);
    }

    public HashMap<String, String> getNeighbors() {
        return neighbors;
    }

    public boolean hasNeighbor(String direction) {
        return neighbors.containsKey(direction);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
