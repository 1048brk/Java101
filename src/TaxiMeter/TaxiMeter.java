package TaxiMeter;

import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {
        int km;
        double perKm = 2.2, totalPrice, startPrice = 10, distancePrice;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your distance as kilometre: ");
        km = input.nextInt();

        distancePrice = (km * perKm);

        totalPrice = Math.floor(distancePrice + startPrice);
        if (totalPrice < 20) {
            totalPrice = 20;
        }
        System.out.println("You will pay " + totalPrice + " $");
    }
}
