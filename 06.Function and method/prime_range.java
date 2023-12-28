/**
 * The "prime_range" class checks for prime numbers within a given range and prints them.
 */
public class prime_range {

        /**
     * Determines whether a given number is prime.
     *
     * @param  n  the number to check for primality
     * @return    true if the number is prime, false otherwise
     */
    public static boolean isprime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    /**
     * Generates prime numbers in the range from 2 to the given number.
     *
     * @param  n  the upper limit of the range
     */
    public static void PrimeinRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");

            }
        }
        System.out.println();
    }
// The `main` method is the entry point of the Java program. It is the method that is executed when the
// program is run.

    public static void main(String[] args) {
        PrimeinRange(200);
    }
}
