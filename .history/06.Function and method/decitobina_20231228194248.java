/**
 * The decitobina class is used to convert decimal numbers to binary numbers.
 */
public class decitobina {
    /**
     * The function BintoDec converts a binary number to its decimal equivalent.
     * 
     * @param binNum The binNum parameter is an integer representing a binary number.
     */
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

/**
 * The main function calls the BintoDec function with an argument of 1.
 */
    public static void main(String[] args) {
        BintoDec(1);
        ;
    }
}
