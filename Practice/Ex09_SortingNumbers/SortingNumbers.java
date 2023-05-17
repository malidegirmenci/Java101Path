package Ex09_SortingNumbers;

import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] args) {
        // created variables
        int a, b, c;

        // taken numbers from user
        Scanner numInput = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = numInput.nextInt();
        System.out.print("Enter second number: ");
        b = numInput.nextInt();
        System.out.print("Enter third number: ");
        c = numInput.nextInt();

        // numbers are compared
        if (a != b && a != c) { // The case that the numbers are not the same was questioned
            if (a > b && a > c) { // The size of a is checked
                if (b > c)
                    System.out.println("Bigger: " + a + " Mid: " + b + " Smaller: " + c);
                else
                    System.out.println("Bigger: " + a + " Mid: " + c + " Smaller: " + b);
            } else if (b > a && b > c) { // b nin buyuklugune bakıldı
                if (a > c)
                    System.out.println("Bigger: " + b + " Mid: " + a + " Smaller: " + c);
                else
                    System.out.println("Bigger: " + b + " Mid: " + c + " Smaller: " + a);
            } else { // c nin buyuklugune bakildi
                if (a > b)
                    System.out.println("Bigger: " + c + " Mid: " + a + " Smaller: " + b);
                else
                    System.out.println("Bigger: " + c + " Mid: " + b + " Smaller: " + a);
            }
        }
        else // the same number status was checked
            System.out.println("Numbers must be different from each other.");
    }
}
