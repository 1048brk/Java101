package HypotenuseTriangle;

import java.util.Scanner;

public class HypotenuseTriangle {
    public static void main(String[] args) {
        double a,b,c;

        Scanner input= new Scanner(System.in);
        System.out.print("Please enter the 1. side of the triangle: ");
        a= input.nextDouble();

        System.out.print("Please enter the 2. side of the triangle: ");
        b= input.nextDouble();

        c=Math.sqrt((a*a)+(b*b));

        System.out.println("The hypotenuse of the triangle: " + c );

    }
}
