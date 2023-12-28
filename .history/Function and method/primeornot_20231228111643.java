public class primeornot {
    public static boolean isprime(int n){
        int isprime = true;
        for(int i =2;i<=n-1;i++){
            if(n%i ==0){//completey
                isprime=false;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
