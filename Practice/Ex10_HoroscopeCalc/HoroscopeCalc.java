package Ex10_HoroscopeCalc;

import java.util.Scanner;
public class HoroscopeCalc {
    public static void main(String[] args) {
        // created variable
        String month;
        int day;
        // entered month and day information from user
        Scanner input = new Scanner(System.in);
        System.out.print("The month you were born: ");
        month = input.nextLine();

        System.out.print("The day you were born: ");
        day = input.nextInt();
        // horoscope calculation based on day and month information
        if (day >= 0 && day <=31){
            if (month.equals("January"))
                if (day < 22) {
                    System.out.println("Your sign is Capricorn");
                } else
                    System.out.println("Your sign is Aquarius");
            else if (month.equals("February")) {
                if (day < 20) {
                    System.out.println("Your sign is Aquarius");
                } else
                    System.out.println("Your sign is Pisces");
            } else if (month.equals("March")) {
                if (day < 21) {
                    System.out.println("Your sign is Pisces");
                } else
                    System.out.println("Your sign is Aries");
            } else if (month.equals("April")) {
                if (day < 21) {
                    System.out.println("Your sign is Aries");
                } else
                    System.out.println("Your sign is Taurus");
            } else if (month.equals("May")) {
                if (day < 22) {
                    System.out.println("Your sign is Taurus");
                } else
                    System.out.println("Your sign is Gemini");
            } else if (month.equals("June")) {
                if (day < 23) {
                    System.out.println("Your sign is Gemini");
                } else
                    System.out.println("Your sign is Cancer");
            } else if (month.equals("July")) {
                if (day < 23) {
                    System.out.println("Your sign is Cancer");
                } else
                    System.out.println("Your sign is Leo");
            } else if (month.equals("August")) {
                if (day < 23) {
                    System.out.println("Your sign is Leo");
                } else
                    System.out.println("Your sign is Virgo");
            } else if (month.equals("September")) {
                if (day < 23) {
                    System.out.println("Your sign is Virgo");
                } else
                    System.out.println("Your sign is Libra");
            } else if (month.equals("October")) {
                if (day < 23) {
                    System.out.println("Your sign is Libra");
                } else
                    System.out.println("Your sign is Scorpio");
            } else if (month.equals("November")) {
                if (day < 22) {
                    System.out.println("Your sign is Scorpio");
                } else
                    System.out.println("Your sign is Sagittarius");
            } else if (month.equals("December")) {
                if (day < 22) {
                    System.out.println("Your sign is Sagittarius");
                } else
                    System.out.println("Your sign is Capricorn");
            } else
                System.out.println("Invalid month!");
        }
        else
            System.out.println("Invalid day!");
    }
}
