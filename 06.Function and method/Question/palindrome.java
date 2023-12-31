import java.util.Scanner;

public class palindrome {
    /**
     * Checks if the given integer n is a palindrome by reversing it
     * digit by digit and comparing the reversed number to the original.
     * 
     * @param n The integer to check for palindrome.
     * @return True if n is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(int n) {
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
     * calls the isPalindrome method to check if the number is a palindrome,
     * and prints the result.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the Number :");
        int x = sc.nextInt();
        System.out.println("the number is : " + x);
        if (isPalindrome(x)) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is Not palindrome");
        }
    }
}