package Ex16_ArmstrongNumbers;

import  java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        // created variables
        int num, digitsNum = 0, digitsValue, tempNum, digitsPow, result = 0 ;

        // number to be checked by armstrong received from user
        Scanner numInput = new Scanner(System.in);
        System.out.print("Armstrong kontrolü yapılacak sayıyı yazınız => ");
        num = numInput.nextInt();

        // Assigned to tempNum to store num value
        tempNum = num;

        // number of digits found
        while(tempNum != 0){
            tempNum /= 10;
            digitsNum++;
        }

        // The num value is reassigned because the temp value was reset
        tempNum = num;
        while(tempNum != 0){
            digitsValue = tempNum % 10;
            digitsPow = 1;
            for (int i = 1; i <= digitsNum; i++)
                digitsPow *= digitsValue;
            result += digitsPow;
            tempNum /= 10;
        }

        // If the total output is equal to the entered number, it is the number of armstrong, otherwise the message not armstrong is printed on the screen.
        if (result == num)
            System.out.println("This is an Armstrong number.");
        else
            System.out.println("This is not an Armstrong number.");
    }
}
