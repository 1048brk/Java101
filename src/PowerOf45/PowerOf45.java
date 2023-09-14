package PowerOf45;

import java.util.Scanner;

public class PowerOf45 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = input.nextInt();

        System.out.println("Until " + n + " those are the power of 4 : ");
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }
        System.out.println("------------------------------------");
        System.out.println("Until " + n + " those are the power of 5 : ");
        for (int i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }
    }
}
