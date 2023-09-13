package CalculateGroser;

import java.util.Scanner;

public class CalculateGrocer {

    public static void main(String[] args) {
        double apple, banana, pear, kiwi;
        Scanner input = new Scanner(System.in);

        System.out.print("How many kilos apple? ");
        apple = input.nextDouble();

        System.out.print("How many kilos banana? ");
        banana = input.nextDouble();

        System.out.print("How many kilos pear? ");
        pear = input.nextDouble();

        System.out.print("How many kilos kiwi? ");
        kiwi = input.nextDouble();

        double totalPrice = (apple * 3) + (banana * 2.5) + (pear * 3.25) + (kiwi * 3.75);

        System.out.print("Total price to pay is: " + totalPrice + " $");

    }
}

