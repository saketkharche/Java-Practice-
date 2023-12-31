public class palindrome {
    public static boolean palin(int n){
        int temp = n;
        int rev = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            rev = rev * 10 + lastDigit;
            temp = temp / 10;
        }
        if (rev == n) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {

    }
}
