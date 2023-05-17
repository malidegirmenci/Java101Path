package Ex05_Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // created variables
        int n1, n2, select;

        // numbers taken from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        n1 = input.nextInt();
        System.out.print("Enter second number: ");
        n2 = input.nextInt();

        // math operations listed
        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.println("What's your choice: ");
        select = input.nextInt();

        // Mathematical operation is done according to the selected option
        switch (select){
            case 1:
                System.out.print("Addition : "+ (n1 + n2));
                break;
            case 2:
                System.out.print("Subtraction : "+ (n1 - n2));
                break;
            case 3:
                System.out.print("Multiplication : "+ (n1 * n2));
                break;
            case 4:
                switch (n2) { //check to n2
                    case 0:
                        System.out.println("You can't enter 0 as second number ");
                        break;
                    default:
                        System.out.print("Division : " + (n1 / n2));
                }
                break;
            default:
                System.out.println("You entered an invalid number");
        }
    }
}
