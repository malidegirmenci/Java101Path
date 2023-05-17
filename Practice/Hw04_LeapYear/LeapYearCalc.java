package Hw04_LeapYear;

import java.util.Scanner;

public class LeapYearCalc {
    public static void main(String[] args) {
        // created variables
        int year;
        boolean isYear = false;

        // year information received from user
        Scanner yearInput = new Scanner(System.in);
        System.out.print("Enter year: ");
        year = yearInput.nextInt();

        // If there is a divisible by 100 out of those divisible by 4, the other if is also evaluated. If not, direct comparison was made.
        if (year % 4 == 0) {
            if (year % 100 == 0)
                isYear = true;
            else
                System.out.println(year + " is a leap year!");
        }
        else
            System.out.println(year + " is not a leap year!");
        if (isYear) {
            if (year % 400 == 0)
                System.out.println(year + " is a leap year!");
            else
                System.out.println(year + " is not a leap year!");
        }
    }
}