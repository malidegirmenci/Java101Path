package Ex00_GradeAverage;

import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        // created variables
        int math, physics, chemical, turkish, history, music;
        // created ınput object from Scanner Class
        Scanner noteInput = new Scanner(System.in);

        // entered notes by the user
        System.out.println("Math Note: ");
        math = noteInput.nextInt();

        System.out.println("Physic Note: ");
        physics = noteInput.nextInt();

        System.out.println("Chemical Note: ");
        chemical = noteInput.nextInt();

        System.out.println("Turkish Note: ");
        turkish = noteInput.nextInt();

        System.out.println("History Note: ");
        history = noteInput.nextInt();

        System.out.println("Music Note: ");
        music = noteInput.nextInt();

        // Average calculated
        double  result = (math + physics + chemical + turkish + history + music) / 6.0;
        System.out.println("Grade Average: " + result);
        // created "Passed or Failed" situation
        String durum = result >= 60 ? "Passed" : "Failed";
        System.out.println(durum);
    }
}
