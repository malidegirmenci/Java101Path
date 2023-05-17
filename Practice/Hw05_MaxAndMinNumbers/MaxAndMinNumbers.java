package Hw05_MaxAndMinNumbers;

import java.util.Scanner;

public class MaxAndMinNumbers {
    public static void main(String[] args) {
        // created variable
        int numAmount, max = 0, min = 0;

        // Information about the amount of numbers to be checked was received from the user
        Scanner numInput = new Scanner(System.in);
        System.out.print("How many numbers will you enter? : ");
        numAmount = numInput.nextInt();
        System.out.println("You must enter a number of "+numAmount);

        // The numbers equal to the number of pieces entered were compared with min and max.
        for (int i= 1; i <= numAmount; i++){
            System.out.println("Enter the "+ i + "'th number: ");
            int k = numInput.nextInt();
            if (k > max)
                max = k;
            else if (k < min)
                min = k;
        }

        // print max and min numbers
        System.out.println("Smallest number: "+ min);
        System.out.println("Greatest number: "+ max);
    }
}
