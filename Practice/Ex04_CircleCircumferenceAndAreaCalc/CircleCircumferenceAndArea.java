package Ex04_CircleCircumferenceAndAreaCalc;

import java.util.Scanner;

public class CircleCircumferenceAndArea {
    public static void main(String[] args) {
        // created variables
        double PI = 3.14, r, areaCircle, perimeterCircle, a, sliceArea;

        // r value taken from user
        Scanner rInput = new Scanner(System.in);
        System.out.print("Yarı çap girin: ");
        r = rInput.nextDouble();

        // calculated area of circle
        areaCircle = PI * (r * r);
        System.out.println("Area of Circle= " + areaCircle);

        // Circumference of circle
        perimeterCircle = 2 * (PI * r);
        System.out.println("Circumference of Circle = " + perimeterCircle);

        // radius r, measure of the central angle a,

        // a value taken from user.
        Scanner aInput = new Scanner(System.in);
        System.out.print("Central angle= ");
        a = aInput.nextDouble();

        // calculated area of slice
        sliceArea = (PI * (r * r) * a) / 360;
        System.out.println("Area of a Segment of Circle with Angle a = " + sliceArea);
    }
}
