package Hw14_SortingOfArray;

import java.util.Scanner;

public class SortingOfArray {
    // sorts the array
    static int[] sortArray(int[] arr){
        int temp; // used as temporary variable for data transfer

        // bubble sorting was done
        // do by checking with the next value
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[j] > arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // Received array element count and elements from user
        Scanner numInput = new Scanner(System.in);
        // entered limit of Array
        System.out.print("Enter the number of elements of the array: ");
        int limitArray = numInput.nextInt();

        int[] arr = new int[limitArray];
        // elements of Array
        for(int i = 0; i < arr.length; i++){
            System.out.print( (i+1)+ "th enter element: ");
            int num = numInput.nextInt();
            arr[i] = num;
        }

        // prints the sorted list
        int[] sortedList;
        sortedList = sortArray(arr);
        System.out.print("Sorted List: ");
        for (int i = 0; i < sortedList.length;i++ ){
            System.out.print(sortedList[i] + " ");
        }
    }
}
