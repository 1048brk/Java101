package ChineseZodiac;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String horoscope = "";
        boolean isError = false;

        System.out.print("Which year were you born? : ");
        int dateOfBirth = input.nextInt();

        int horoscopeNumber = (dateOfBirth % 12);

        switch (horoscopeNumber) {
            case 0:
                horoscope = "Monkey";
                break;
            case 1:
                horoscope = "Rooster";
                break;
            case 2:
                horoscope = "Dog";
                break;
            case 3:
                horoscope = "Pig";
                break;
            case 4:
                horoscope = "Rat";
                break;
            case 5:
                horoscope = "Ox";
                break;
            case 6:
                horoscope = "Tiger";
                break;
            case 7:
                horoscope = "Rabbit";
                break;
            case 8:
                horoscope = "Dragon";
                break;
            case 9:
                horoscope = "Snake";
                break;
            case 10:
                horoscope = "Horse";
                break;
            case 11:
                horoscope = "Goat";
                break;
            default:
                isError = true;
                break;
        }

        if (isError) {
            System.out.println("Please enter a valid year!.");
        } else {
            System.out.println("Your chineese horoscope is : " + horoscope);
        }
    }
}
