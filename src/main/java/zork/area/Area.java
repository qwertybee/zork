package zork.area;

import java.util.ArrayList;
import java.util.HashMap;

public class Area {

    private final String name;
    private final String description;
    private HashMap<String, Area> neighbors;

    public Area(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setNeighbor(String direction, Area neighbor) {
        neighbors.put(direction, neighbor);
    }

    public ArrayList<Area> getNeighbors() {
        return new ArrayList<>(neighbors.values());
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
