package ex08_SuggestEvent;

import java.util.Scanner;

public class SuggestEvent {
    public static void main(String[] args) {
        // created variable
        int heat;

        // temp value taken from user
        Scanner heatInput = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        heat = heatInput.nextInt();

        // Event recommendation conditions are written and printed on the screen according to the temperature.
        if(heat < 5)
            System.out.println("You can ski!");
        else if (heat <= 25) {
            if (heat <10)
                System.out.println("You can go to the cinema");
            else if (heat <= 15)
                System.out.println("You can go to the cinema or on a picnic");
            else
                System.out.println("You can go on a picnic");
        } else
            System.out.println("You can go swimming");
    }
}
