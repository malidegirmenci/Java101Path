package Ex13_PowerOfNum;

import java.util.Scanner;
public class PowerOfNumbers {
    public static void main(String[] args) {
        // created variable
        int num;

        // Scanner object created to retrieve data from user
        Scanner numInput = new Scanner(System.in);

        /* We write a program that takes the number entered with Java loops as a power of 2 and prints all exponents to the screen.
        System.out.println("Write the exponent value to be taken.");
        num = numInput.nextInt();
        // Find the exponents of 2 and print it on the screen
        if (num == 0) {
            System.out.println("2 ^ " + num + " = 1 eder.");
        } else {
            System.out.println("The powers of 2 are sorted by the number of "+ num);
            for (int i = 1, k=1; k <= num; k++, i*=2) {
                System.out.println("2 ^ " + k + " = "+ (i * 2));
            }
        }

         */

        /* Prints powers of 2 up to the limit number received from the user.

        System.out.println("Write the limit number you want the powers of 2 to be ");
        num = numInput.nextInt();

        System.out.println("The powers of 2 are sorted by the number of "+ num);
        for (int i = 1, k=0; i <= num;k++, i*=2) {
            System.out.println("2 ^ "+k+" = "+i);
        }

         */


        System.out.println("Write to limit number you want the powers of 4 and 5 to be ");
        num = numInput.nextInt();

        // prints exponents of four and five
        System.out.println("The powers of 4 and 5 are sorted by the number of " + num);
        for (int i = 1, j= 1, k=0; i <= num || j<=num;k++, j *= 4, i*=5) {
            System.out.println("4 ^ "+k+" = "+j);
            System.out.println("5 ^ "+k+" = "+i);
            System.out.println("---------------");
        }

    }
}
