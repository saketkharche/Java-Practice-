// public class Pattern {
//     public static void main(String[] args) {
//         // for (int i= 1; i<=4;i++) {
//         // System.out.println("****");
//         int line = 1;
//         while (line <= 4) {
//             System.out.println("****");
//             line++;

//         }
//     }
// }

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /* Read and save input */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double b = scan.nextDouble();
        String c = scan.next();
        scan.close();

        /* Print data */
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
    }
}
