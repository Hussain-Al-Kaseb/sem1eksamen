package Application;

import Program.StringHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
                ArrayList<String> names = new ArrayList<>();
                names.add("Katrine");
                names.add("Stine");
                names.add("Joakim");
                names.add("Anders");


                Scanner scanner = new Scanner(new File("src\\Program\\Data\\Data.txt"));
                StringHandler handler = new StringHandler();

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String newText = handler.replaceText(line,names);
                    System.out.println(newText);
                }
                scanner.close();
            }
        }



