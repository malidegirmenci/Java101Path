package Hw03_ChineseZodiac;

import java.util.Scanner;

public class ChineseZodiacCalc {
    public static void main(String[] args) {
        // created variable
        int year, zodiac;
        // taken year information from user
        Scanner yearInput = new Scanner(System.in);
        System.out.print("Enter your year of birth: ");
        year = yearInput.nextInt();
        // calculated zodiac
        zodiac = year % 12;
        // horoscope is printed on the screen according to the result
        switch (zodiac) {
            case 0 -> System.out.println("Your Chinese Zodiac sign: Monkey");
            case 1 -> System.out.println("Your Chinese Zodiac sign: Rooster");
            case 2 -> System.out.println("Your Chinese Zodiac sign: Dog");
            case 3 -> System.out.println("Your Chinese Zodiac sign: Pig");
            case 4 -> System.out.println("Your Chinese Zodiac sign: Mice");
            case 5 -> System.out.println("Your Chinese Zodiac sign: Ox");
            case 6 -> System.out.println("Your Chinese Zodiac sign: Tiger");
            case 7 -> System.out.println("Your Chinese Zodiac sign: Rabbit");
            case 8 -> System.out.println("Your Chinese Zodiac sign: Dragon");
            case 9 -> System.out.println("Your Chinese Zodiac sign: Snake");
            case 10 -> System.out.println("Your Chinese Zodiac sign: Horse");
            case 11 -> System.out.println("Your Chinese Zodiac sign: Sheep");
            default -> System.out.println("Invalid value!");
        }
    }
}
