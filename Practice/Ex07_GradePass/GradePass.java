package Ex07_GradePass;

import java.util.Scanner;

public class GradePass {
    public static void main(String[] args) {
        // created variables
        double math, physics, turkish, chemistry, music,result;
        // assigned to variables from user
        Scanner input = new Scanner(System.in);

        System.out.print("Math Note: ");
        math = input.nextDouble();
        System.out.print("Physics Note: ");
        physics = input.nextDouble();
        System.out.print("Turkish Note: ");
        turkish = input.nextDouble();
        System.out.print("Chemistry Note: ");
        chemistry = input.nextDouble();
        System.out.print("Music Note: ");
        music = input.nextDouble();

        // If your courses are not between 0 and 100, they are not included in the average.
        if (math < 0 || math > 100 )
            result = (physics + turkish + chemistry + music) / 4;
        else if (physics < 0 || physics > 100 )
            result = (math + turkish + chemistry + music) / 4;
        else if (turkish < 0 || turkish > 100 )
            result = (math + physics + chemistry + music) / 4;
        else if (chemistry < 0 || chemistry > 100)
            result = (math + physics + turkish + music) / 4;
        else if (music < 0 || music > 100)
            result = (math + physics + turkish + chemistry) / 4;
        else
            result = (math + physics + turkish + chemistry + music) / 5;

        // print average
        System.out.println("Average: " + result);

        // If the result is less than 55, it is conditioned as fail and if it is above, it is conditioned and output to the screen.
        if (result >= 55){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}
