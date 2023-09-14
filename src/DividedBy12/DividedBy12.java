package DividedBy12;

import java.util.Scanner;


// From 0 to a wished number, find the average of the numbers which are divided by 3 and 4

public class DividedBy12 {
    public static void main(String[] args) {
        int k;
        int sum = 0, dividedNumbers = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                sum += i;
                dividedNumbers++;
            }
        }
        System.out.println("The sum of all the divided numbers is " + sum);
        int average = sum / dividedNumbers;
        System.out.println("From 0 to " + k + " There are " + dividedNumbers + " numbers which are divided by 3 and 4");
        System.out.println("The average of those numbers is " + average);
    }
}
