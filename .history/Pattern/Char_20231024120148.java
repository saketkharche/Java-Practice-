public class Char {
    public static void main(String[] args) {
        int n = 58;
        char ch = 'A';
        // outer loop
        for (int line = 1; line <= n; line++) {
            // inner loop
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
