package Ex03_Taximeter;

import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        // created variables
        int distance, opening = 10;
        double price, perKM = 2.20, bill;

        // distance value taken from user
        System.out.print("Distance: ");
        Scanner distanceInput = new Scanner(System.in);
        distance = distanceInput.nextInt();

        // price ve bill calculated
        price = distance * perKM;
        bill = opening + price;
        bill = bill <= 20 ? 20 : opening + price;

        // print bill
        System.out.println("Amount due: " + bill + " TL");
    }




}
