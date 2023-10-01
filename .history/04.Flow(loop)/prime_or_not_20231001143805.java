public class prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                isPrime = false;
    }
}
