import java.util.Scanner;

public class function {
    // function using void
    public static void printhelloworld() {
        System.out.println("Hello world!!!");
        return;
    }

    public static void calsum(int num1, int b) {

        int sum = a + b;
        System.out.println("Sum of numbers is:" + sum);
    }

    public static void main(String[] args) {
        // printhelloworld();// this is function call
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calsum();
    }
}
