package Hw02_FlyTicketFeeCalc;

import java.util.Scanner;

public class FlyTicketFeeCalc {
    public static void main(String[] args) {

        // created variables
        double perKM = 0.10, bill;
        int distanceKM, age, tripType;

        // ticket information received from the user
        Scanner input = new Scanner(System.in);
        System.out.print("How many kilometers will you travel? :");
        distanceKM = input.nextInt();

        System.out.print("What is the type of travel? \n1- One Way\n2- Round Trip\nSelection: ");
        tripType = input.nextInt();

        System.out.print("How old is the passenger?  :");
        age = input.nextInt();


        /* The amount for the invoice was determined over km, the discount was applied according to the travel type and age information.
         it was printed on the screen.
         otherwise warning messages are given and printed on the screen */
        if(distanceKM >= 0){
            bill = distanceKM * perKM;
            if(age >= 0){
                if(age < 12) {
                    bill -= bill * 0.5;
                }
                else if(age <=24){
                    bill -= bill * 0.1;
                }
                else {
                    bill -= bill * 0.3;
                }
            }
            else
                System.out.println("Invalid age!");
            if(tripType == 1 || tripType == 2) {
                if (tripType == 2) {
                    bill -= bill * 0.2;
                    System.out.println("Bill: " + 2 * bill);
                } else {
                    System.out.println("An invalid travel type was entered");
                }
            }else {
                System.out.println("Invalid KM entered");
            }
        }
    }
}
