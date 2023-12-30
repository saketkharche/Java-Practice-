public class DecToBin {
    public static void decTobin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;


        }
        System.out.println("Decimal of "+ myNum + " = " +b);
    }

    public static void main(String[] args) {

    }
}
