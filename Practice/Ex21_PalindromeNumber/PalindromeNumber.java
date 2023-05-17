package Ex21_PalindromeNumber;

public class PalindromeNumber {
    // Created method for palindrome control
    static boolean isPalindrome(int number){
        // created variable
        int temp = number, reverseNum = 0, lastNumber;
        while (temp != 0){ // unless the number is 0
            lastNumber = temp % 10; // takes the last digit of the number
            reverseNum = (reverseNum * 10) + lastNumber; // Multiply by 10 in reverseNum and add the last digit, thus converting it to the first digit
            temp /= 10; // The number of digits is reduced by dividing the temp by 10
        }
        return reverseNum == number; // compares two numbers and outputs true or false
    }
    public static void main(String[] args) {

        System.out.println(isPalindrome(40) ? "This is a Palindrome number" : "This is not Palindrome number");
    }
}
