import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the week number(1-7)");
        int X = sc.nextInt();
        switch(X){
            case 1:
                    System.out.println("Monday");
                break;

            case 2:
                    System.out.println("Thuesday");
                break;

            case 3:
                    System.out.println("Wednesday");
                break;
            
            case 4:
                    System.out.println("Thursday");
                break;

            case 5:
                    System.out.println("Friday");
                break;

            case 6:
                    System.out.println("Satuday");
                break;
        
            case 7:
                    System.out.println("Monday");
                break;

            default:
                System.out.println("A Week only has 7 days you Idiot!!!");
        }

    }
}