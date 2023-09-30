import java.util.Scanner;

public class Loop_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Range : ");
        int range = sc.nextInt();
        int counter = 1;
        while (counter <= range) {
            System.out.println(counter + "");
            counter++;

        }
    }
}
2023-09-30 12:16:20