package PowerOf2;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = input.nextInt();
        System.out.println("Until " + n + " those are the power of 2 : ");

        for (int i = 1; i <= n; i *= 2) {
            System.out.println(i);
        }
    }
}
