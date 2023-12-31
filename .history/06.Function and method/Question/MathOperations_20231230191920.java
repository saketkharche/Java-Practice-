import java.util.Scanner;

/**
 * MathOperations
 */
public class MathOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1:");
        double num1 = sc.nextDouble();

        System.out.println("Enter Num2:");
        double num2 = sc.nextDouble();

        cal(num1, num2);
    }

    public static void cal(double num1, double num2) {
        System.out.println("min is: " + Math.min(num1, num2));
        System.out.println("max is: " + Math.max(num1, num2));
        System.out.println("sqrt of num1 is: " + Math.sqrt(num1));
        System.out.println("pow of num1^2 is: " + Math.pow(num1, 2));
        System.out.println("abs of num1 is: " + Math.abs(num1));
    }
}
