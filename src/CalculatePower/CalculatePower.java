package CalculatePower;

import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
        //3^4 ==> 3*3*3*3
        // 3=number 4=power
        int number, power;
        Scanner input = new Scanner(System.in);
        System.out.print("Which number is the base?: ");
        number = input.nextInt();

        System.out.print("Which power do you want?: ");
        power = input.nextInt();

        int total = 1;
        for (int i = 1; i <= power; i++) {
            total *= number;
        }
        System.out.println("Result is : " + total);
    }
}
