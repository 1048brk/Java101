package EbobEkok;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        int ebob = 1;
        int ekok = 1;
        System.out.print("Please enter a number: ");
        n1 = input.nextInt();

        System.out.print("Please enter another number: ");
        n2 = input.nextInt();

        //Solution 1
        //It starts from 1 until the ebob ++
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println("This number can divide n1 and n2 in common : " + i);
                ebob = i;
            }
        }
        System.out.println("The EBOB of " + n1 + " and " + n2 + " is : " + ebob);
        System.out.println("*****************");

        //Solution 2
        //It starts from n1 until the ebob --(reverse)
        for (int k = n1; k >= 1; k--) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                System.out.println("Second solution for ebob is : " + ebob);
                break;
            }
        }
        //Ekok is maximum n1*n2
        for (int i = 1; i <= (n1 * n2); i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                System.out.println("The EKOK of " + n1 + " and " + n2 + " is : " + i);
                break;
            }
        }
        System.out.println("**********************");
        // Second Solution for EKOK
        int i = 1;
        while (i <= n1 * n2) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("Second solution for EKOK is : " + ekok);
    }
}


