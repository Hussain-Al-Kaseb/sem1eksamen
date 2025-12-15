package application;

import program.Item;
import program.ItemLoader;
import program.TodoList;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ItemLoader itemLoader = new ItemLoader();
        ArrayList<Item> loadedData = itemLoader.loadFile("C:\\Users\\Bruger\\IdeaProjects\\To-do liste\\src\\program\\todo.csv  ");

        TodoList list = new TodoList(loadedData);
        list.displayItems();

    }

}
