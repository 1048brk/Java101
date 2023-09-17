package FindingMinMax;

import java.util.Scanner;

/*
* Java ile klavyeden girilen N tane sayma sayısından en büyük ve
en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
Senaryo=
Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
En küçük sayı: -22 */

public class FindingMinMax {
    public static void main(String[] args) {
        int counter, number;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.print("How many numbers will you enter? ");
        Scanner input = new Scanner(System.in);
        counter = input.nextInt();

        while (counter != 0) {
            System.out.print("Enter your number: ");
            number = input.nextInt();
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
            counter--;
        }
        System.out.println("Maximum number is : " + max);
        System.out.println("Minimum number is : " + min);
    }
}


