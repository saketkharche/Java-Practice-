
/**
 * The "palindrome" class in Java checks if a given integer is a palindrome by reversing it digit by
 * digit and comparing the reversed number to the original.
 */
import java.util.Scanner;

public class palindrome {
    /**
     * Checks if the given integer n is a palindrome by reversing it
     * digit by digit and comparing the reversed number to the original.
     * 
     * @param n The integer to check for palindrome.
     * @return True if n is a palindrome, false otherwise.
     */
    public static boolean palin(int n) {
        int temp = n;
        int rev = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            rev = rev * 10 + lastDigit;
            temp = temp / 10;
        }
        if (rev == n) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * The main method prompts the user to input a number,
     * reads the input using Scanner,
     * calls the palin method to check if the number is a palindrome,
     * and prints the result.
     */
    /**
     * The main method prompts the user to input a number,
     * reads the input using Scanner,
     * calls the palin method to check if the number is a palindrome,
     * and prints the result.
     */
    /**
     * The main method is the entry point of the program.
     * It prompts the user to input a number using Scanner. 
     * It calls the palin method to check if the input number is a palindrome.
     * It prints the result of the check to the console.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the Number :");
        int x = sc.nextInt();
        System.out.println("the number is :");
        if (palin(x)) {
            System.out.println("Number is palindrome");
    }
}
}
