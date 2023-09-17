package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        /*
        Fibonacci dizisi, 0'dan başlar ve sonsuza kadar.
        Her rakam, bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ tarafına yazılır.
        Fibonacci dizisinin ilk on sayısı şu şekildedir:
        9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        int number1 = 0;
        int number2 = 1;
        int total;

        System.out.println("The fibonacci series for the number of " + number + " is : ");

        for (int i = 1; i <= number; i++) {
            System.out.print(number1 + " ");

            total = number1 + number2;
            number1 = number2;
            number2 = total;
        }
        /* INPUT=
           Fibonacci serisi icin eleman sayisini girin: 9

         * OUTPUT=
           9 Elemanli Fibonacci Serisi: 0 1 1 2 3 5 8 13 21
        */
    }
}
