package Hw11_PrimeNumberWithRecursive;
import java.util.Scanner;
public class PrimeNumberWithRecursive {
    static boolean isPrime(int num, int counter){

        if(num <= 2) // if the number is less than two
            return num == 2; // and returns true if the number is equal to two
        if (num % counter == 0) // returns false if number has integers
            return false;
        if (counter * counter > num) // returns true if the square of the counter is greater than the number, so as not to try all the numbers
            return true;
        return isPrime(num, counter + 1);
    }

    public static void main(String[] args) {
        int num;
        Scanner numInput = new Scanner(System.in);
        // number received from user
        System.out.print("Enter the number: ");
        num = numInput.nextInt();

        if (isPrime(num,2))
            System.out.println("This is a prime number");
        else
            System.out.println("This is not a prime number");
    }
}
