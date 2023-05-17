package Hw01_GroceryCashier;

import java.util.Scanner;

public class GroceryCashier {
    public static void main(String[] args) {
        // created variables
        double pearKGPrc = 2.14, appleKGPrc = 3.67, tomatoKGPrc = 1.11, bananaKGPrc = 0.95, aubergineKGPrc = 5.0, bill = 0, kg;

        // taken KG values of Products by user
        Scanner kgInput = new Scanner(System.in);

        System.out.print("How Many Kilos of Pear? = ");
        kg = kgInput.nextDouble();
        bill += pearKGPrc * kg;

        System.out.print("How Many Kilos of Apple? = ");
        kg = kgInput.nextDouble();
        bill += appleKGPrc * kg;

        System.out.print("How Many Kilos of Tomato? = ");
        kg = kgInput.nextDouble();
        bill += tomatoKGPrc * kg;

        System.out.print("How Many Kilos of Banana?");
        kg = kgInput.nextDouble();
        bill += bananaKGPrc * kg;

        System.out.print("How Many Kilos of Aubergine?");
        kg = kgInput.nextDouble();
        bill += aubergineKGPrc * kg;

        // print bill
        System.out.print("Total Price = " + bill + "TL");
    }
}
