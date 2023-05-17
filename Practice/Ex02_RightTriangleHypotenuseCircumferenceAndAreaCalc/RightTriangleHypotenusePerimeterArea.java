package Ex02_RightTriangleHypotenuseCircumferenceAndAreaCalc;

import java.util.Scanner;
public class RightTriangleHypotenusePerimeterArea {
    public static void main(String[] args) {
        // created variables
        int a, b;
        double  c, perimeterTriangle, areaTriangle, u;

        // edge lengths taken from user
        Scanner edgeInput = new Scanner(System.in);
        System.out.print("a. edge: ");
        a = edgeInput.nextInt();
        System.out.print("b. edge: ");
        b = edgeInput.nextInt();

        // hypotenuse formula
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hypotenuse: "+ c);

        // u value
        u = (a+b+c) / 2;

        // perimeter of triangle
        perimeterTriangle = 2*u;
        System.out.println("Perimeter of Triangle: " + perimeterTriangle);

        // area of triangle
        areaTriangle = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin Alanı: "+ areaTriangle);
    }
}
