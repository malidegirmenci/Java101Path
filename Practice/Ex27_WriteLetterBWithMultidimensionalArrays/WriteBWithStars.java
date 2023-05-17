package Ex27_WriteLetterBWithMultidimensionalArrays;

public class WriteBWithStars {
    public static void main(String[] args) {
        // variable and array defined
        String chars = "*";
        String[][] arr;
        arr = new String[7][8];
        // across the row and column
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if(row == 0 || row == 3 || row == 6) { // if in the first middle and last row
                    System.out.print(chars);
                }else{
                    if (col == 0 || col == 7) {
                        System.out.print(chars); // in the first and last column

                    }
                    if (col < 8) {
                        System.out.print(" "); // between the first and last column
                    }
                }
            }
            if(row == 0 || row == 3 || row == 6) { // in the first middle and last row
                System.out.print("\b"); // deletes the last character
            }
            System.out.println(); // scrolls down one line when the column is complete
        }

    }
}
