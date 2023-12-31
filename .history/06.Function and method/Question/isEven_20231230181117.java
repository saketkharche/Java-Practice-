/**
 * The "isEven" class checks if a given number is even or odd and prints the result.
 */
import java.util.Scanner;

public class isEven {
    /**
     * Determines whether the given integer is even or odd.
     *
     * @param  a  the integer to be checked
     * @return    true if the integer is even, false if it is odd
     */
    public static boolean EvenorOdd(int a) {
        int x;

        if (a % 2 == 0) {
            System.out.println("it is even");
            return true;

        } else {
            return false;
        }
    }

    /**
     * This function takes input from the user and determines whether the input number is even or odd.
     *
     * @param  args  an array of String arguments from the command line
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the Number :");
        int x = sc.nextInt();
        System.out.println("the number is :");
        if (EvenorOdd(x)) {
            System.out.println("Number is even");

        } else {
            System.out.println("Number is odd");
        }
    }

}
