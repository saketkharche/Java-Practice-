/**
 * pass_array_as_fun_arug
 */
public class pass_array_as_fun_arug {
    public static void update(int marks[], int nonChangeable) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;

        }
    }

    public static void main(String[] args) {
        int marks[] = { 97, 98, 99 };
        int nonChangeable = 5;
        update(marks, nonChangeable);
        System.out.println(nonChangeable);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

    }
}