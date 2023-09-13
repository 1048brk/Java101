package EvaluationExam;

import java.util.Scanner;

public class EvaluationExam {
    public static void main(String[] args) {
        double math, music, english, science, average;
        int limit = 55, invalidLesson = 0, totalLesson = 4;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your math exam result: ");
        math = input.nextDouble();

        System.out.print("Please enter your music exam result: ");
        music = input.nextDouble();

        System.out.print("Please enter your english exam result: ");
        english = input.nextDouble();

        System.out.print("Please enter your science exam result: ");
        science = input.nextDouble();

        if (math < 0 || math > 100) {
            System.out.println("Your math exam result has an error, it must be between 0 and 100");
            math = 0;
            invalidLesson++;
        }
        if (music < 0 || music > 100) {
            System.out.println("Your music exam result has an error, it must be between 0 and 100");
            music = 0;
            invalidLesson++;
        }
        if (english < 0 || english > 100) {
            System.out.println("Your english exam result has an error, it must be between 0 and 100");
            english = 0;
            invalidLesson++;
        }
        if (science < 0 || science > 100) {
            System.out.println("Your science exam result has an error, it must be between 0 and 100");
            science = 0;
            invalidLesson++;
        }

        average = (math + music + english + science) / (totalLesson - invalidLesson);
        System.out.println("The average of your valid exams is " + average + ". You have " + invalidLesson + " invalid exam.");
        if (average >= limit) {
            System.out.println("Congratulations, you passed the class.");
        } else {
            System.out.println("You have to repeat your exams...");
        }

    }
}
