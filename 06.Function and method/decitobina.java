public class decitobina {
    public static void BintoDec(int binNum) {
        int MyNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;

            binNum = binNum / 10;
        }
        System.out.println("decimal of " + MyNum + "=" + decNum);
    }

    public static void main(String[] args) {
        BintoDec(1001);
        ;
    }
}
