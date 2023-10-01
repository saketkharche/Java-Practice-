package Question;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        int choice;
        int evensum;
        int oddsum;

        do{
            System.out.println("enter the number ");

            number = sc.nextInt();

            if(number%2==0){
                evensum+=number;

            }else{
                oddsum+=number;
            }
            System.out.println("do you want to continue 1 for yes 0 for no");
            choice = sc.nextInt();

        }while(choice==1);
        System.out.println( "Sum of even numbers: " + evensum);
        System.out.println(    "Sum of odd numbers: " + oddsum);
    }
}
