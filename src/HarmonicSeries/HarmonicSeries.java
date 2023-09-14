package HarmonicSeries;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("For harmonic series, please enter a N number: ");
        int n = input.nextInt();
        double result = 0;
        for (double i = 1; i <= n; i++) {
            result += (1 / i);
        }
        System.out.println("The result of the harmonic series is = " + result);
    }
}
