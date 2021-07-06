package zork.area;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Map {

    private static final String text = "C:/Users/Lily/Desktop/zorkasciimap1.txt";
    private static File mapAscii = new File(text);

    public static void readMap() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(mapAscii);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }

}
