import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        
        // for(int i=1; i<=10; i++){
        //     if(i==5){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        Scanner sc=new Scanner(System.in);
        do{
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n+" is divisible by 10");
        }while(true);
        }
    }
}
