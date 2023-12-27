import java.util.Scanner;

public class callbyvalue {
    // function using void
    public static void printhelloworld() {
        System.out.println("Hello world!!!");
        return;
    }

    public static void calsum(int num1, int num2) {

        int sum = num1 + num2;
        System.out.println("Sum of numbers is:" + sum);
    }

    public static swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public static void main(String[] args) {
        //Swap - values exchange
        int a = 5;
        int b = 10;

        //temp
        swap(List, a, b)
        
    }
}
