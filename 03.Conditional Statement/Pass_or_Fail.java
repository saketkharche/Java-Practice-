import java.util.Scanner;

public class Pass_or_Fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        String reportCard = marks >= 33 ? "PASS" : "FAIL";
        System.out.println(reportCard);
    }
}
