package Ex20_GCDandLCM;

import java.util.Scanner;

public class GCDLCMCalc {
    public static void main(String[] args) {
        // got two numbers from user
        Scanner numInput = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = numInput.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = numInput.nextInt();

        // created variable
        int gcd;
        int smallestNum = Math.min(firstNum, secondNum);
        // smallest number determined
        // gcd found and printed
        /* Method 1
        for(int i = 1; i <= smallestNum; i++){
            if (firstNum % i == 0 && secondNum % i == 0)
               gcd = i;
        }
        System.out.println("(GCD)Greatest common divisor: "+ gcd);

         */
        // Method 2
        for (int i = smallestNum; i >= 1; i--){
            if(firstNum % i == 0 && secondNum % i == 0) {
                gcd = i;
                System.out.println("(GCD)Greatest common divisor: " + gcd);
                break;
            }
        }
        // LCM found and wrote
        for (int i = 1; i <= (firstNum * secondNum); i++) {
            if (i % firstNum == 0 && i % secondNum == 0){
                System.out.println("Least common multiples: "+i);
                break;
            }
        }
    }
}
