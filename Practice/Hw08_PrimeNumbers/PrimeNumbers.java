package Hw08_PrimeNumbers;

public class PrimeNumbers {
    public static void main(String[] args) {
        // create variable
        int limit = 100;
        // found prime numbers check up to limit
        for (int i = 2; i <= limit; i++) {
            boolean primeNum = true; // boolean variable created for prime number check
            for (int k = 2; k < i; k++){ // Checked if the number has divisors
                if (i % k == 0) {
                    primeNum = false; // prime false if it has a divisor
                    break;
                }
            }
            if (primeNum) // If prime is true then printed to the screen
                System.out.println(" " +i+ " ");
        }
    }
}
