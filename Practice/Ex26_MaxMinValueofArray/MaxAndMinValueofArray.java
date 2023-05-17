package Ex26_MaxMinValueofArray;
import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMinValueofArray {
    public static void main(String[] args) {
        // array and variable created
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int min = list[0];
        int max = list[0];

        // printed unsorted list
        System.out.print("Unsorted List: ");
        System.out.print("[");
        for (int i: list){
            System.out.print(i+ " ");
        }
        System.out.println("\b]");
        // printed sorted list
        Arrays.sort(list);
        System.out.println("Sorted List: "+Arrays.toString(list));

        // found max and min values
        for(int i: list){
            if (i < min){
                min = i;
            }
            if (i > max){
                max = i;
            }

        }
        // max and min printed
        System.out.println("Min value: "+ min);
        System.out.println("Max value: "+ max);

        // origin point taken from user
        Scanner numInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int originPoint = numInput.nextInt();

        // The smallest and largest numbers closest to the origin are taken and printed on the screen.
        int smallerPoint = Arrays.binarySearch(list,originPoint) - 1;
        int biggerPoint = Arrays.binarySearch(list,originPoint) + 1;
        System.out.println("Smallest point nearest of origin: "+ list[smallerPoint]);
        System.out.println("Biggest point nearest of origin: "+ list[biggerPoint]);


    }
}
