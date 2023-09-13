package SimpleCalculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        //n1 is first number , n2 is second number
        double n1, n2;
        int selection;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        n1 = input.nextDouble();
        System.out.print("Please enter the second number: ");
        n2 = input.nextDouble();
        System.out.print("1- Add\n2- Subtract\n3- Multiply\n4- Divide\nWhich one do you select? ");
        selection = input.nextInt();

        switch (selection) {
            case 1:
                System.out.println("The result of " + n1 + "+" + n2 + " is " + (n1 + n2));
                break;
            case 2:
                System.out.println("The result of " + n1 + "-" + n2 + " is " + (n1 - n2));
                break;
            case 3:
                System.out.println("The result of " + n1 + "*" + n2 + " is " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("The result of " + n1 + "/" + n2 + " is " + (n1 / n2));
                } else {
                    System.out.println("You can not divide any number to 0.");
                }
                break;
            default:
                System.out.println("Please enter a valid selection.");
        }
    }
}
