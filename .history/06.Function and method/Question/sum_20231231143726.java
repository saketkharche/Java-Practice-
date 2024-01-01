import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("integer as input:");
        int digit = sc.nextInt();
        System.out.println("the sum is "+ sumDigit(digit));

    }
public static int sumDigit(int n){
    int sumOfDigit = 0;
    while ((n>0)) {
        int lastDigit = n %10;
        sumOfDigit+=lastDigit;
        n/=10;
        
    }
}
}
