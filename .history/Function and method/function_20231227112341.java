import java.util.Scanner;

public class function {
    // function using void
    public static void printhelloworld() {
        System.out.println("Hello world!!!");
        return;
    }

    public static void main(String[] args) {
        printhelloworld();//this is function call
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);

    }
}
