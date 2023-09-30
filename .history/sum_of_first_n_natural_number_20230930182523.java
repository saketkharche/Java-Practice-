import java.util.Scanner;

public class sum_of_first_n_natural_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range of n ");
        int n;
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;// sum += i;
            i++;
        }
        System.out.println(sum+"sum of first "+n+" natural numbers");
    }
}
