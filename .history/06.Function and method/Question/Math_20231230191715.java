import java.util.Scanner;
import java.math.*;

/**
 * Math
 */
public class Math {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1:");
        double num1 = sc.nextInt();

        System.out.println("Enter Num2:");
        double num2 = sc.nextInt();

    }

    public static void cal() {
        System.out.println("min is" + Math.min());
        System.out.println("max is" + Math.max());
        System.out.println("sqrt is" + Math.sqrt());
        System.out.println("pow is" + Math.pow(double, double));
        System.out.println("avg is" + Math.avg());
        System.out.println("abs is" + Math.abs());
    }
}