package zork.area;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.*;

public class CreateAreas implements Serializable {

    private final String text = "C:/Users/Lily/Desktop/zorkmap1.txt";
    private final HashMap<String, Area> AREAS = new HashMap<>();

    public CreateAreas() {
        File file = new File(text);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] splited = line.split(";");
            String name = splited[0];
            String description = splited[1];
            String[] neighbors = splited[2].trim().split(",");
            String[] directions = splited[3].trim().split(",");
            Area temp = new Area(splited[0], description);
            for (int i=0; i<neighbors.length; i++) {
                temp.setNeighbor(directions[i].trim(), neighbors[i].trim());
            }
            AREAS.put(name, temp); // name of area and its reference
        }
    }

    public HashMap<String, Area> getAreas() {
        return AREAS;
    }

}
