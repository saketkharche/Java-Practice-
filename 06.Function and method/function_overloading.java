public class function_overloading {
    // // sum of 2 nos
    // public static int sum(int a, int b) {
    // return a + b;
    // }

    // // sum of 3 num
    // public static int sum(int a, int b, int c) {
    // return a + b + c;

    // }
    // fun cal int sum
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 6));
        System.out.println(sum(4.2f, 8.6f));
    }
}
