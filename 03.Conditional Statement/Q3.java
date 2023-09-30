import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter cost of three item");
        float item1 = sc.nextFloat();
        float item2 = sc.nextFloat();
        float item3 = sc.nextFloat();
        float total;
        System.out.println("Cost of all item are:");
        System.out.println(total = item1 + item2 + item3);
        float Gst = total + (0.18f * total);
        System.out.println("After Gst");
        System.out.println(Gst);

    }
}
