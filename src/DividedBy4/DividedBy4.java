package DividedBy4;

import java.util.Scanner;

public class DividedBy4 {
    public static void main(String[] args) {

        //Ask for entering a number until the user writes an odd number
        //Add the numbers which are divided by 4 and print them
        int n;
        int sum = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Please enter a number: ");
            n = input.nextInt();
            if (n % 4 == 0) {
                sum += n;
                System.out.println("Your number is divided by 4: " + n);
            }
        } while (n % 2 == 0);

        System.out.println("Total is " + sum);
    }
}

