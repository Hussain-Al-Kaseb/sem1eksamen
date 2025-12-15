package Application;

import Program.User;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
    User hussain = new User("Hussain", "hej123");
    User tess = new User("Tess", "hej123", "Tess@tessmail.dk");
    User tine = new User("Tine", "hej123", "Tine@tinemail.dk", 12345678);



        ArrayList<User> users = new ArrayList<>();
        users.add(hussain);
        users.add(tess);
        users.add(tine);
        users.sort(Comparator.comparing(User::getName));
        for (User u: users){
            System.out.println(u);
        }

    }

}
