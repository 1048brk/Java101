package PrimeNumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //First loop for divided number
        for (int i = 2; i < 100; i++) {
            boolean isPrime = true;
            //Second loop for divider number
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                    //If it divides, no need to continue
                }
            }
            if (isPrime == true) {
                System.out.println(i);
            }
        }
    }
}

