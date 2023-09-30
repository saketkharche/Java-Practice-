import java.util.Scanner;

public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        double tax;
        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = (double) (income * 0.2);

        } else {
            tax = (double) (income * 0.3);
        }
        System.out.println("your tax is : " + tax);

    }
}
