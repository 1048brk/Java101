package TriangleStar;

import java.util.Scanner;

public class TriangleStar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the height of your triangle: ");
        int n = input.nextInt();
        //As long as the height of the triangle(n)
        for (int i = 1; i <= n; i++) {
            //For space
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            // For star
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            // In every loop, we have to print in the new line
            System.out.println();
        }
    }
}
