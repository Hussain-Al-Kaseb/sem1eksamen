package program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemLoader {
    public ArrayList<Item> loadFile(String path) throws IOException {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(new File(path));

        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            String description = parts[0].trim();
            boolean isDone = Boolean.parseBoolean(parts[1].trim());
            items.add(new Item(description, isDone));
        }
        scanner.close();
        return items;
        }
}
