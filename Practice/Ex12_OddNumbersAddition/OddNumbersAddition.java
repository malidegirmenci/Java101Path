package Ex12_OddNumbersAddition;

import java.util.Scanner;

public class OddNumbersAddition {
    public static void main(String[] args) {
        //created variables
        int num, sum = 0;

        Scanner numInput = new Scanner(System.in);

        /* Write a program that accepts input from the user until a negative value is entered with Java loops and adds the odd numbers from the entered values and prints them on the screen.
        do {
            System.out.print("Enter a number: ");
            num = numInput.nextInt();
            if(num % 2 == 1){
                sum += num;
            }
        }while (num >= 0);
        System.out.println("Addition of numbers= "+ sum);

         */

        //With Java loops, we write a program that accepts inputs from the user until a single number is entered and collects even and multiples of 4 from the entered values and prints it on the screen.

        //As long as the value received from the user is even, we collect all the entered values.
        do {
            System.out.print("Enter a number: ");
            num = numInput.nextInt();
            if(num % 4 == 0){
                sum += num;
            }
        }while (num % 2 == 0);

        System.out.println("Addition of numbers= "+ sum);
    }
}
