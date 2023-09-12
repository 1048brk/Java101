package CalculateTax;

import java.util.Scanner;

public class CalculateTax {
    public static void main(String[] args) {
        double firstPrice;
        double taxRate = 0.18;

        Scanner input= new Scanner(System.in);
        System.out.print("Please enter the price without the tax: ");
        firstPrice = input.nextDouble();

        double tax = (firstPrice*taxRate);
        System.out.println("The tax for " + firstPrice + " $"+ " is " + tax + " $" );
        System.out.println("Total price to pay is: " + (firstPrice + tax) + " $");

    }
}
