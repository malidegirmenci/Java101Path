package Ex18_TriangleWithStars;

import java.util.Scanner;

public class TriangleWithStars {
    public static void main(String[] args) {

        // number of digits received from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter digits number: ");
        int n = input.nextInt();

        //create triangle
        for(int i = 1; i <= n; i++){ // row numbers
            for(int k = 1; k <= (n - i); k++) // space numbers
                System.out.print(" ");
            for(int j = 1; j <= (2 * i) - 1;j++) // star numbers
                System.out.print("*");
            System.out.println(); // skip to a sub line
        }
        //convert to diamond
        for(int i = n - 1; i > 0; i--) { // row numbers
            for (int k = 1; k <= (n - i); k++) // space numbers
                System.out.print(" ");
            for (int j = 1; j <= (2 * i) - 1; j++) // star numbers
                System.out.print("*");
            System.out.println(); // skip to a sub line
        }
    }
}
