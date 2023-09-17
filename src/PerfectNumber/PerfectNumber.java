package PerfectNumber;

import java.util.Scanner;

/*
*Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
* */

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("To see if it is a perfect number, enter a number: ");
        int number = input.nextInt();
        int total = 0;

        //Loop from 1 to number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (number < 1) {
            System.out.println("Invalid number!!!");
        }
        if (number == total) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
