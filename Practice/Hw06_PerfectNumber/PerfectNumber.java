package Hw06_PerfectNumber;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        // created variable
        int num, sum = 0;

        // Received number to check from user
        Scanner numInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = numInput.nextInt();

        int tempNum = num; // num number stored in tempNum
        for (int i = 1; i < tempNum; i++){ // all the divisors of the number added together
            if (tempNum % i == 0){
                sum += i;
            }
        }
        if (sum == num) // If the sum with num is equal, not perfect, not perfect, is output on the screen.
            System.out.println(num+" is Perfect number.");
        else
            System.out.println(num+" is not Perfect number.");
    }
}
