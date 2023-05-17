package Ex17_HarmonicSeries;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        // created variable
        int num;
        double sum = 0;

        // got a value from user
        Scanner numInput = new Scanner(System.in);
        System.out.println("Enter N number: ");
        num = numInput.nextInt();

        // made Harmonic Series Addition
        for (int i = 1; i <= num; i++){
            sum += ((double) 1 / i);
        }
        System.out.println(sum);
    }
}
