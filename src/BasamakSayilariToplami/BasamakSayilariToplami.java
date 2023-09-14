package BasamakSayilariToplami;

import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        int basamakValue;
        int result = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            basamakValue = tempNumber % 10;
            result += basamakValue;
            tempNumber /= 10;
        }
        System.out.println(number + " sayisinin basamak sayilarinin toplami= " + result);
    }
}
