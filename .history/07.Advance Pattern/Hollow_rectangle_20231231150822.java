public class Hollow_rectangle {
    public static void hollow_rectangle(int totRows, int totCols) {
        // outter Looop
        for (int j = 1; j <= totCols; j++) {
            // cell - (i,j)
            if (i == 1 || i == totRows || j == 1 || j == totCols) {
                System.out.print("*");
            } else {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        hollow_rectangle(10, 5);
    }
}
