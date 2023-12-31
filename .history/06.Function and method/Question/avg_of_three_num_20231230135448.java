//MY attempt
// public class avg_of_three_num {
//     public static void avg_of_three_nums(int a, int b, int c) {

//         int avg = a + b + c / 3;
//         System.out.println("The average of a , b ,c :"+ a  + b + c + " numbers is: " + avg);
//         return;
//     }

//     public static void main(String[] args) {
//         avg_of_three_nums(10, 20, 30);
//     }
// }

import java.util.Scanner;

public class avg_of_three_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double x = sc.nextDouble();
        System.out.println("Input the Second number: ");
        double y = sc.nextDouble();
        System.out.println("Input the Third number: ");
        double z = sc.nextDouble();

        System.out.println("The average value is " +average(x,y,z))+"\n");
    }

    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }
}
