package Hw00_BodyMassIndex;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        //created variables
        double length, weight, bodyMassIndex;

        Scanner dgrInput = new Scanner(System.in);
        // length and weight values taken from user

        System.out.print("Please enter your length in meters: ");
        length = dgrInput.nextDouble();

        System.out.print("Please enter your weight: ");
        weight = dgrInput.nextDouble();

        // Body mass index calculated
        bodyMassIndex = weight / (length * length);
        System.out.print("Your body mass index is: " + bodyMassIndex);
    }
}
