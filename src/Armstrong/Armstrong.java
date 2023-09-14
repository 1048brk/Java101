package Armstrong;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        int basamakNumber = 0;
        int tempNumber = number;
        int basamakValue;
        int result = 0;
        int basamakPower;

        // Basamak sayisini bulmak icin=
        while (tempNumber != 0) {
            tempNumber /= 10;
            basamakNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basamakValue = tempNumber % 10;
            basamakPower = 1;
            for (int i = 1; i <= basamakNumber; i++) {
                basamakPower *= basamakValue;
            }
            result += basamakPower;
            tempNumber /= 10;
        }
        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Basamak sayisi bulma islemi=
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0

        // Bir sayinin son basamagini bulma=
        // 2451 % 10 = 1(kalan 1 dir)
        // 245 % 10 = 5 (kalan)
    }
}
