package BodyMassIndex;
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double height, weight, bodyMassIndex ;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your weight as kg(for example 74.50): ");
        weight = input.nextDouble();

        System.out.print("Please enter your height as meter(for example 1.80): ");
        height = input.nextDouble();

        bodyMassIndex = (weight/(height*height));

        System.out.println("Your body mass index is: " + bodyMassIndex);

    }
}
