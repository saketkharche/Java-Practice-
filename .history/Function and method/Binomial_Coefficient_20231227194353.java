public class Binomial_Coefficient {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;

        }
        return f;
    }

    public static int bincoeff(int n, int r){
        int fact_n=factorial(n);
        int fact_r=factorial(fact_n)
    }
    public static void main(String[] args) {
        
    }
    
}
