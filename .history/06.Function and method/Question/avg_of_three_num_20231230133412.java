public class avg_of_three_num {
    public static void avg_of_three_nums(int a, int b, int c) {

        int avg = a + b + c / 3;
        System.out.println("The average of a , b ,c :"+ a "\t" + b + c + " numbers is: " + avg);
        return;
    }

    public static void main(String[] args) {
        avg_of_three_nums(10, 20, 30);
    }
}
