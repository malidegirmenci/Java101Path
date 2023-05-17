package Ex11_EvenNumberFinder;

import java.util.Scanner;

public class EvenNumberFinder {
    public static void main(String[] args) {

        //created variables
        int num, sum=0, counter=0;
        float average;

        //received a number from the user
        Scanner numInput = new Scanner(System.in);
        System.out.println("Enter a limit number");
        num = numInput.nextInt();

        // From the even numbers up to the entered number, the numbers that are divisible by 3 and 4 are determined and summed in the sum variable, how many numbers are found with the counter
        for ( int i = 0; i <= num; i+=2){
            if(i % 3 == 0 && i % 4 == 0){
                System.out.println(i);
                sum += i;
                ++counter;
            }
        }
        average = (float) sum / (counter); // average
        System.out.println("Average of divisors by 3 and 4: "+ average);
    }
}
