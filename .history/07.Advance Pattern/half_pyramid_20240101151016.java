public class half_pyramid {
    public static void pattern(int a, int b) {
        int n = 1;
        for (int j = 1; j < n - 1; j++) {
            System.out.print(" ");
            for (int i = 1; j <= i; i++)
                System.out.println("*");
        }

    }

    public static void main(String[] args) {
        pattern(5, 4);

    }
}
