package Ex30_PalindromicWords;

import java.util.Scanner;

public class PalindromicWords {
    static boolean isPalindromic(String str){
        // beginning and end characters are questioned and gradually approached
        int firstLetter = 0; // first letter index
        int lastLetter = str.length() - 1; // last letter index
        while (firstLetter < lastLetter){ // as long as the first letter index is less than the last letter index
            if(str.charAt(firstLetter) != str.charAt(lastLetter)) // return false if they are not the same letter
                return false;
            firstLetter++; // go to next index
            lastLetter--; // go to previous index
        }
        return true; // return true if letters are the same
    }
    public static void main(String[] args) {
        // word received from user
        String str;
        Scanner strInput = new Scanner(System.in);
        System.out.print("Enter the word: ");
        str = strInput.nextLine();

        // print the result
        if(isPalindromic(str))
            System.out.println(str+" is a Palindromic word");
        else{
            System.out.println(str+" is not a Palindromic word.");
        }
    }
}
