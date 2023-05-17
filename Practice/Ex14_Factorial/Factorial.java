package Ex14_Factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        /* Calculate factorial

        //create variables
        int num, total = 1;

        //got values from user
       Scanner numInput = new Scanner(System.in);
       System.out.print("Enter number for factorial: ");
       num=numInput.nextInt();

       //factorial calculate with for struct
       for(int i=1; i<=num; i++)
           total *= i;

        //factorial calculate with while struct
        while (num > 1) {
            total *= num;
            num--;
        }
        System.out.println("Factorial= " + total);
        */

        //created variables
        int numN,numR, comb, nFac = 1, rFac=1, n_rFac=1;

        // got values from user
        Scanner numInput = new Scanner(System.in);
        System.out.println("Enter N and R numbers for combination: ");

        System.out.print("N number: ");
        numN=numInput.nextInt();

        System.out.print("R number: ");
        numR=numInput.nextInt();

        // calculated factorial
        while (numN > 1) {
            nFac *= numN;
            numN--;
        }
        while (numR > 1) {
            rFac *= numR;
            numR--;
        }
        while ((numN - numR) > 1) {
            n_rFac *= (numN - numR);
            numN--;
            numR--;
        }
        // calculated combination
        comb = nFac / (rFac * (n_rFac));

        // print result
        System.out.println("Combination result: "+ comb);


    }
}

