
package Methods;

/*Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
 */
public class FindingPalindrom {
    static boolean isPalindrom(int number) {
        int temporaryNumber = number;
        int reverseNumber = 0;
        int lastDigit;

        while (temporaryNumber != 0) {
            lastDigit = temporaryNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            temporaryNumber /= 10;
        }
        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(363));
    }
}

// System.out.println(number + " is a Palindrom number");
// System.out.println(number + " is a not Palindrom number");