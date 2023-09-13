package HoroscopeFinding;

import java.util.Scanner;

public class HoroscopeFinding {
    public static void main(String[] args) {
        int month, day;
        String horoscope = "";
        boolean isError = false;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your birthdate in numbers as month and day");
        System.out.print("Which month were you born?(for example 1 for January): ");
        month = scan.nextInt();
        System.out.print("Which day of the month were you born?: ");
        day = scan.nextInt();

        if (month <= 12) {

            if (month == 1) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = " Oğlak";
                    } else {
                        horoscope = " Kova";
                    }
                } else {
                    isError = true;
                }
            }
            // -------------------------------------------------------------
            if (month == 2) {
                if (day >= 1 && day <= 29) {
                    if (day < 20) {
                        horoscope = "Kova";
                    } else {
                        horoscope = "Balık";
                    }
                } else {
                    isError = true;
                }
            }
            // -------------------------------------------------------------
            if (month == 3) {
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        horoscope = "Balık";
                    } else {
                        horoscope = "Koç";
                    }
                } else {
                    isError = true;
                }
            }
            // -------------------------------------------------------------
            if (month == 4) {
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        horoscope = "Koç";
                    } else {
                        horoscope = "Boğa";
                    }
                } else {
                    isError = true;
                }
            }
            // -------------------------------------------------------------
            if (month == 5) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Boğa";
                    } else {
                        horoscope = "İkizler";
                    }
                } else {
                    isError = true;
                }
            }
            // -------------------------------------------------------------
            if (month == 6) {
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        horoscope = "İkizler";
                    } else {
                        horoscope = "Yengeç";
                    }
                } else {
                    isError = true;
                }
            }
            // -------------------------------------------------------------
            if (month == 7) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "Yengeç";
                    } else {
                        horoscope = "Aslan";
                    }
                } else {
                    isError = true;
                }
            }
            // -------------------------------------------------------------
            if (month == 8) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "Aslan";
                    } else {
                        horoscope = "Başak";
                    }
                } else {
                    isError = true;
                }
            }
            // -------------------------------------------------------------
            if (month == 9) {
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        horoscope = "Başak";
                    } else {
                        horoscope = "Terazi";
                    }
                } else {
                    isError = true;
                }
            }
            // -------------------------------------------------------------
            if (month == 10) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "Terazi";
                    } else {
                        horoscope = "Akrep";
                    }
                } else {
                    isError = true;
                }
            }
            // -------------------------------------------------------------
            if (month == 11) {
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        horoscope = "Akrep";
                    } else {
                        horoscope = "Yay";
                    }
                } else {
                    isError = true;
                }
            }
            // -------------------------------------------------------------
            if (month == 12) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Yay";
                    } else {
                        horoscope = "Oğlak";
                    }
                } else {
                    isError = true;
                }
            }
            // -------------------------------------------------------------

        } else {
            isError = true;
            System.out.println("The month value can not be greater than 12. ");
        }

        if (isError == true) {
            System.out.println("You must enter a valid value, please try again.");
        } else {
            System.out.println("Your horoscope is :" + horoscope);
        }
    }
}
