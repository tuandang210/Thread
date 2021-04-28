package PrimeN;

import java.util.Scanner;

public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Nhập số lượng cần in: ");

        int number = 1000;
        int count = 1;
        int i = 2;
        while (count < number) {
            if (i == 2) {
                System.out.println(i);
            }
            i++;
            int k =(int) Math.sqrt(i);
            boolean a = true;
            for (int j = 2; j<=k;j++) {
                if ((i % j) == 0) {
                    a=false;
                   break;
                }
            }
            if (a) {
                System.out.println(i+" OP");
                count++;
            }
        }
    }
}
