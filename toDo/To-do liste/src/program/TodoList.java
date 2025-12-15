package program;

import java.io.IOException;
import java.util.ArrayList;

public class TodoList {

    ArrayList<Item> items;


    public void displayItems(){
        int counter = 1;

        for(Item i : items){
            System.out.println(counter++ + ". "+i.getDescription() + ", " + (i.getIsDone() ? "Færdig" : "Ikke færdig"));
        }

    }

    public TodoList(ArrayList<Item> items) {
        this.items = items;
    }
}
