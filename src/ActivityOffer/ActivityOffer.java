package ActivityOffer;

import java.util.Scanner;

public class ActivityOffer {
    public static void main(String[] args) {

        double heat;

        Scanner input = new Scanner(System.in);
        System.out.print("What is the temperature today? ");
        heat = input.nextDouble();
        if (heat < 5) {
            System.out.println("You can go skiing");
        } else if (heat < 15) {
            System.out.println("You can go to cinema");
        } else if (heat < 25) {
            System.out.println("You can go to picnic");
        } else {
            System.out.println("You can swim.");
        }
    }
}
