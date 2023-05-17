package Hw09_FibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // create variable
        int  numA = 0, numB = 1, temp, limit;
        // got limit value from user
        Scanner numInput = new Scanner(System.in);
        System.out.print("Set the Fibonacci limit: ");
        limit = numInput.nextInt();
        // created Fibonacci Series
        if(limit <= 0)
            System.out.println("Invalid number!");
        else if(limit < 2)
            System.out.print("Fibonacci Series: 0 "); //first num : 0
        else{
            System.out.print("Fibonacci Series: ");
            System.out.print("0 "); //first num : 0
            for (int i = 2; i <= limit; i++) { // other elements created, value transfer used
                temp = numB;
                numB += numA;
                numA = temp;
                System.out.print(numA+ " "); // printed number
            }
        }
    }
}
