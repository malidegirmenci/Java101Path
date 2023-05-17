package Ex29_GuessNumberGame;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {

        Random randNum = new Random();
        int randomNum = randNum.nextInt(10); // created random number

        Scanner numInput = new Scanner(System.in);
        int rights = 0; // rights counter
        int rightsLimit = 5; // right limit
        int[] wrongCount = new int[rightsLimit]; // incorrectly entered numbers kept in array
        boolean isWrong = false;
        boolean isWin = false;

        System.out.println("Enter a number between 1 and 100");
        while (rights < rightsLimit){ // as long as the number of rights is less than the limit of rights
            System.out.print("Guess: ");
            int num = numInput.nextInt(); // enter number

            if(num < 0 || num > 100){ // if number is not between 1 and 100 give warning message continue loop
                System.out.println("You did not enter a number between 1 and 100. Pay attention to the border!");
                continue;
            }
            if(num == randomNum){ // If the prediction and the hidden number are equal
                System.out.println("Congratulations! You found the hidden number.: "+ randomNum); // print
                isWin = true; //
                break; //
            }else{ // if guess is not equal
                isWrong = true;
                wrongCount[rights++] = num; // add the number to the array where the errors are kept
                System.out.println("You couldn't know the number");
                if(num > randomNum){ // if the number is greater than the hidden number
                    System.out.println("Your guess is greater than the hidden number"); // warning msg
                }else {
                    System.out.println("Your guess is smaller than the hidden number"); // warning msg
                }
                System.out.println("Try again.\nYour remaining right: "+ (rightsLimit-rights)); // print remaining right
            }
            System.out.println("---------------------------------------------------------");
        }
        if (!isWin){
            System.out.println("You lost!");
        }
        if (isWrong) { // prints if there is a wrong
            System.out.print("Your wrong guesses: ");
            // to not write the rest of the null values of the array
            for (int i : wrongCount) { // browse the values
                if (i != 0) // value if not zero
                    System.out.print(i + " "); // print
            }
        }
    }
}
