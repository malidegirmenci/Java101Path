package Hw15_FrequencyOfArray;

import java.util.Arrays;

public class FrequencyOfArray {
    public static void main(String[] args) {
        // created array and variable
        int[] list = {21,2,16,2,6,6,16,16};
        int counter = 0;

        Arrays.sort(list); // Array sorted
        System.out.println("Array: "+Arrays.toString(list)); // prints sorted list

        // check to elements
        for (int i= 0; i < list.length; i++){ // for whole elements
            if (i == 0) { // If it is in the first element -> the goal is to start by checking only the first index to avoid an out of range error.
                for (int j = 0; j < list.length; j++) { // go to other elements
                    if ((i != j) && (list[i] == list[j])) {  // If the indices are different and there are the same values
                        counter++;  //
                    }
                }
                System.out.println("Number "+ list[i] + "repeated" + counter + " times"); // prints
            }
            else if (list[i] != list[i - 1]) { // if next and previous are not the same element
                for(int j = 0; j < list.length; j++){ // go to other elements
                    if ((i != j) && (list[i] == list[j])) { // If the indices are different and there are the same values
                        counter++; // increment the counter
                    }
                }
                System.out.println("Number "+ list[i] + "repeated" + counter + " times"); // ekrana yazdir
            }
            counter = 1; // return 1 if the same value does not exist
        }
    }
}
