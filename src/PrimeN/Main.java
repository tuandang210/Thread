package PrimeN;

public class Main {
    public static void main(String[] args) {
        OptimizedPrimeFactorization a = new OptimizedPrimeFactorization();
        LazyPrimeFactorization b = new LazyPrimeFactorization();
        Thread a1= new Thread(a);
        Thread b1= new Thread(b);
        a1.start();
        b1.start();
    }
}
