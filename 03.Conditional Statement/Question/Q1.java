import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int A = sc.nextInt();
        if (A > 0) {
            System.out.println("the number is positive:" + A);
        } else {
            System.out.println("number is negative:" + A);
        }

    }
}
