import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int fact=1;
        System.out.println("Enter any poitive number: ");
        num = sc.nextInt();

        for(int i =1;i<=num;i++){
            fact = fact * i;
            
        }
        System.out.println(num + "! is " + fact);

    }
}