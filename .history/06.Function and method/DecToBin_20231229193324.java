public class DecToBin {
    public static void decTobin(int n) {
        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(rem, binNum))

        }
    }

    public static void main(String[] args) {

    }
}
