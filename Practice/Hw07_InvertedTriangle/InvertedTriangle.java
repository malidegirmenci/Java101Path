package Hw07_InvertedTriangle;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        // got a value from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter digits number: ");
        int n = input.nextInt();

        // create inverted triangle
        for(int i = n - 1; i > 0; i--) { // line number
            for (int k = 1; k <= (n - i); k++) // space number
                System.out.print(" ");
            for (int j = 1; j <= (2 * i) - 1; j++) // star number
                System.out.print("*");
            System.out.println(); // pas sub line
        }
    }
}
