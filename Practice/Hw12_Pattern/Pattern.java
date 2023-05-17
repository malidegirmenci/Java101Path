package Hw12_Pattern;

import java.util.Scanner;

public class Pattern {

    public static void pattern(int num, boolean isFlag, int temp){ // draws a pattern -> gets a number, gets a work flag for a milestone, uses a temp to store a value
        System.out.print(num + " "); // first value is printed
        if (num > 0 && isFlag){ // if the number is greater than zero and not at the turning point
            pattern(num - 5, true, temp); // the number decreases by 5
        } else { // 0 or negative numbers with turning point
            if (num == temp){ // If num and temp are equal
                return; // finish function
            }
            pattern(num + 5, false, temp); // increase the number by 5 and now the flag is false so it does not enter the above condition
        }
    }

    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        // number is taken from the user
        int num = numInput.nextInt();
        // call function
        pattern(num,true, num);
    }
}
