package Factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        int total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("To find its factorial, enter a number: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        System.out.println(n + "! = " + total);
    }
}
