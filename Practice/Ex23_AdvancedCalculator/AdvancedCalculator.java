package Ex23_AdvancedCalculator;

import java.util.Scanner;

public class AdvancedCalculator {
    // Addition Function
    static void sum(int a, int b){
        int result = a + b;
        System.out.println("Addition: "+ result);
    }
    // Subtraction Function
    static void minus(int a, int b){
        int result = a - b;
        System.out.println("Subtraction: "+ result);
    }

    // Multiplication Function
    static void times(int a, int b){
        int result = a * b;
        System.out.println("Multiplication: "+ result);
    }

    // Division Function
    static void division(int a, int b){
        int result = a / b;
        System.out.println("Division: "+ result);
    }
    // Exponent Function
    static void power(int a, int b){
        int result = 1;
        for (int i = 1, k = 1; k <= b; k++, i *= a){
            result = i * a;
        }
        System.out.println(a+" ^ "+ b +" = " + result);
    }
    // Factorial Function
    static void factorial(int a){
        int aFac = 1;
        while (a > 1){
            aFac *= a;
            a--;
        }
        System.out.println(a+"Factorial: "+aFac);
    }
    // Modulo Function
    static void modulo(int a, int b){
        int result;
        result = a % b;
        System.out.println(a+" % " +b+ " = "+result);
    }
    // Rectangular Area and Perimeter Calculation
    static void rectangle(int a, int b){
        int areaR, perimeterR;
        areaR = a * b;
        System.out.println("a. edge: "+a+" | b. edge: "+b+" Area= "+ areaR);
        perimeterR = 2*(a + b);
        System.out.println("a. edge: "+a+" | b. edge: "+b+" Perimeter= "+ perimeterR);
    }

    public static void main(String[] args) {

        //
        Scanner numInput = new Scanner(System.in);
        int select;
        // islemler listelendi
        String menu = """ 
                1- Addition
                2- Subtraction
                3- Multiplication
                4- Division
                5- Exponent
                6- Factorial
                7- Modulo
                8- Rectangular Area and Perimeter Calculation
                9- Exit
                """;
        while(true) {
            System.out.println(menu);
            System.out.println("---------------------------------");
            System.out.print("Select to process: ");
            select = numInput.nextInt();
            if (select == 9) // exit
                break;
            System.out.print("First Number: ");
            int a = numInput.nextInt();
            System.out.print("Second Number: ");
            int b = numInput.nextInt();
            switch (select) { // functions called according to selection
                case 1 -> sum(a, b);
                case 2 -> minus(a, b);
                case 3 -> times(a, b);
                case 4 -> {
                    if (b == 0)
                        System.out.println("PThe denominator cannot be zero. Repeat the operation");
                    else
                        division(a, b);
                }
                case 5 -> power(a,b);
                case 6 -> {
                    if ( b != 0)
                        System.out.println("Cannot get a second value");
                    else
                        factorial(a);
                }
                case 7 -> modulo(a,b);
                case 8 -> rectangle(a,b);
            }
        }
        System.out.println("The program has been closed");
    }
}
