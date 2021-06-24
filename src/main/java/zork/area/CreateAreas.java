package zork.area;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CreateAreas {

    private final String text = "C:/Users/Lily/Desktop/zorkmap1.txt";
    private final HashMap<String, Area> AREAS = new HashMap<>();

    public CreateAreas() throws FileNotFoundException {
        File file = new File(text);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] splited = line.split(";");
            String name = splited[0];
            String description = splited[1];
            Object[] neighbors = splited[2].trim().split(",");
            String[] directions = splited[3].trim().split(",");
            Area temp = new Area(splited[0], description);
            for (int i=0; i<neighbors.length; i++) {
                temp.setNeighbor(directions[i], (Area) neighbors[i]);
            }
            AREAS.put(name, temp); // name of area and its reference
        }
    }

    public HashMap<String, Area> getAreaNeighbors() {
        return AREAS;
    }

}
