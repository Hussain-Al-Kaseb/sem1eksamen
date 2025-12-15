package Program;

import java.util.ArrayList;
import java.util.Scanner;

public class FlowerShop {
    private ArrayList<String> flowers = new ArrayList<>();
    private double total;
    public int limit = 100;


    public FlowerShop() {
        flowers.add("1");
        flowers.add("2");
        flowers.add("3");
        flowers.add("4");
        flowers.add("5");
        flowers.add("6");
        flowers.add("7");
        flowers.add("8");
        flowers.add("9");
        flowers.add("10");
    }
    private void priceList(){
        System.out.println("Prisliste:");
        for(int i = 0; i < flowers.size(); i++){
            if(i < 4){
                System.out.println("Blomst: " + flowers.get(i) +" 20kr" );
            }
            else if(i < 7){
                System.out.println("Blomst: " + flowers.get(i) +" 40,50kr" );
            }
            else if(i < 10){
                System.out.println("Blomst: " + flowers.get(i) +" 80kr" );
            }

        }
        System.out.println("Buket: 50kr");
    }
        public double runDialog() {
            int counter = 1;
            Scanner scanner = new Scanner(System.in);
            priceList();
            System.out.println("Vælg 3 blomster");
            while (counter <= 3) {
                int input = scanner.nextInt();

                if (input < 4) {
                    total = total + 20;
                } else if (input >= 4 && input < 7) {
                    total = total + 40.50;

                } else if (input >= 7 && input < 10) {
                    total = total + 80;
                }

                counter++;

            }
            System.out.println("Vil du købe en Buket?");
            System.out.println("1) ja eller 2) nej");
            int input = scanner.nextInt();
            if (input == 1) {
                total = total + 50;

            }
            System.out.println("din samlede pris er: " + total+ "kr.");
            return total;

        }

}
