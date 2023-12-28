public class primeopti {
    public static boolean isprime(int n) {
        
        for(int=2;i<=Math.sqrt(n);){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isprime(15));
    }
}