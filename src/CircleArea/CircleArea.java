package CircleArea;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        double r, pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle: ");
        r = input.nextDouble();

        double area = (pi * r * r);
        double perimeter = (2 * pi * r);

        System.out.println("The area of this circle is " + area);
        System.out.println("The perimeter of this circle is " + perimeter);
    }
}
