package CalculateAveragePoint;
import java.util.Scanner;

public class CalculateAveragePoint {

    public  static void main(String[] args) {
        int math,music, science,english;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your math exam result : ");
        math = input.nextInt();

        System.out.print("Enter your music exam result : ");
        music = input.nextInt();

        System.out.print("Enter your science exam result : ");
        science = input.nextInt();

        System.out.print("Enter your english exam result : ");
        english = input.nextInt();



        double sum = (math + music+ science + english);
        double average = (sum/4);

        System.out.println("Your exam average is : " + average);
        System.out.println(average < 60 ? "You failed, need to repeat them again." : "Congratulations, you passed.");

    }
}






