package Application;

import Program.FlowerShop;

public class Main {
    public static void main(String[] args) {
    FlowerShop flowerShop = new FlowerShop();

    double total = flowerShop.runDialog();

        System.out.println(total);

        if(total > flowerShop.limit){
            System.out.println("gratis shipping");
        }
    }
}
