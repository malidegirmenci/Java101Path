package Hw10_ExponentialNumbersWithRecursive;
import java.util.Scanner;
public class ExponentialNumbersWithRecursive {
    // Calculates exponential numbers
    static int exponential(int base, int exp){
        int result = 1;
        if(exp == 0) // Returns the result when the exponent is 0
            return result;
        else {
            result *= base * exponential(base, --exp); // Multiplies the base until the exponent is 0
        }
        return result;
    }

    public static void main(String[] args) {
        // created variable
        int base, exp;
        // base and exponent information received from user
        Scanner numInput = new Scanner(System.in);

        System.out.print("Base: ");
        base = numInput.nextInt();

        System.out.print("Exponent: ");
        exp = numInput.nextInt();

        // print result
        System.out.println(base + " ^ " + exp + " = " +exponential(base,exp));
    }
}
