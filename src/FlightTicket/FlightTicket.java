package FlightTicket;

import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int km, age, type;
        double perKm = 0.10;
        double lastPrice = 0, firstPrice;
        String customer = "";

        System.out.print("How many kilometres is your flight?: ");
        km = input.nextInt();

        System.out.print("How old are you?: ");
        age = input.nextInt();

        if (age < 12) {
            customer = "child";
        } else if (age >= 12 && age < 24) {
            customer = "young";
        } else if (age >= 65) {
            customer = "senior";
        }
        firstPrice = (km * perKm);

        switch (customer) {
            case "child":
                lastPrice = firstPrice - (firstPrice * 0.50);
                break;
            case "young":
                lastPrice = firstPrice - (firstPrice * 0.10);
                break;
            case "senior":
                lastPrice = firstPrice - (firstPrice * 0.30);
                break;
            default:
                lastPrice = firstPrice;
                break;
        }

        System.out.print("For only going write 1, and for go/return write 2: ");
        type = input.nextInt();

        if (type == 2) {
            lastPrice = (lastPrice * 0.80) * 2;
            System.out.println("For going/returning you must pay " + lastPrice);
        }
        System.out.println("For only going you must pay " + lastPrice);

    }
}
