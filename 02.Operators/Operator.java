public class Operator {
    public static void main(String[] args) {
        // Binary operator(+,-,*,/,%)
        /*
         * int a = 10;
         * int b = 20;
         * System.out.println("add ="+ (a+b));
         * System.out.println(a-b);
         * System.out.println(a*b);
         * System.out.println(a/b);
         * System.out.println(a%b);
         */
        // Unary operator(++,--)
        /*
         * int a = 10;
         * 
         * int c = a++;// post increment
         * 
         * System.out.println(c);
         * int b = ++a;//
         * System.out.println(b);
         * 
         * System.out.println(b--);
         * System.out.println(--c);
         */

        // Relational operator
        /*
         * int a = 10;
         * int b = 5;
         * System.out.print("a is equal to b: ");
         * System.out.println(a == b);
         * 
         * System.out.print("a is not equal to b: ");
         * System.out.println(a != b);
         * 
         * System.out.print("a is Greater than b: ");
         * System.out.println(a > b);
         * 
         * System.out.print("a is less than b: ");
         * System.out.println(a < b);
         * 
         * System.out.print("a is Greater than equal to b:");
         * System.out.println(a >= b);
         * 
         * System.out.print("a is less than equal to b:");
         * System.out.println(a <= b);
         */

        /*
         * // Logical Operator
         * // logical &&
         * System.out.println((3 > 2) && (5 < 0));
         * // Logical ||or
         * System.out.println((3 > 2) || (5 < 0));
         * // logical Not!
         * System.out.println(!(3 > 2));
         */

         //Assignment operator
         int A = 10;
         A = A +10;
        System.out.println(A);
         A += 10;//Faster 
        System.out.println(A);
         A -= 10;
        System.out.println(A);
         A *= 10;
        System.out.println(A);
         A /= 10;
        System.out.println(A);
         A %= 10;
        System.out.println(A);
    }

}
