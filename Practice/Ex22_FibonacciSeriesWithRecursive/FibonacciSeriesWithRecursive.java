package Ex22_FibonacciSeriesWithRecursive;

import java.util.Scanner;

public class FibonacciSeriesWithRecursive {
    // create Fibonacci Series
    static int Fibonacci(int index){
        // created variable
        int res;
        if (index < 0) // Returns null if parameter value is less than 0
            return -1;
        else if(index < 2) // returns 1 if index value is 0 or 1
            return index;
        res = Fibonacci(index - 1) + Fibonacci(index - 2); // Collects the previous and two previous numbers of the parameter and sends it back to the function
        return  res;
    }

    public static void main(String[] args) {
        // takes limit from user
        Scanner limInput = new Scanner(System.in);
        System.out.print("Enter a limit for the Fibonacci series: ");
        int limit = limInput.nextInt();
        // It gives an error message if the value of -1 in the Fibonacci function
        if (Fibonacci(limit) == -1){
            System.out.println("Invalid number!");
            return;
        }
        System.out.println("Fibonacci Series: ");
        for(int i = 1; i <= limit; i++) // Runs functions up to the limit
            System.out.print(Fibonacci(i) +" ");
    }
}
