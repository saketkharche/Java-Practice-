import java.util.Scanner;

public class isEven {
    public static boolean EvenorOdd(int a) {
        int x;

        if (a % 2 == 0) {
            System.out.println("it is even");
            return true;

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the Number :");
        int x = sc.nextInt();
        System.out.println("the number is :");
        if (EvenorOdd(xW)) {
            System.out.println("Number is even");

        } else {
            System.out.println("Number is odd");
        }
    }

}
