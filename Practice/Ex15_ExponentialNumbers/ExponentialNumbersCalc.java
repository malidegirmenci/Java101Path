package Ex15_ExponentialNumbers;

import java.util.Scanner;

public class ExponentialNumbersCalc {
    public static void main(String[] args) {
        int num, force;

        // We write a program that takes the number entered with Java loops as a power of 2 and prints all exponents to the screen.
        Scanner numInput = new Scanner(System.in);
        System.out.print("Let's take the powers of which number? : ");
        num = numInput.nextInt();
        System.out.print("What power of this number should we take? : ");
        force = numInput.nextInt();

        //bases calculated and printed on the screen
        if (force == 0) {
            System.out.println(num +" ^ " + force + " = 1");
        } else {
            System.out.println("Numbers up to the "+force+" power of "+num+" are listed");
            for (int i = 1, k=1; k <= force; k++, i*=num) {
                System.out.println(num + " ^ " + k + " = "+ (i * num));
            }
        }
    }
}
