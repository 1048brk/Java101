package Atm;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Your Username :");
            userName = input.nextLine();
            System.out.print("Your Password : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome to your bank!");
                do {
                    System.out.println("1-Deposit money\n" + "2-Withdraw money\n" + "3-Show balance\n" + "4-Quit");
                    System.out.print("Please select your operation : ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("How much money : ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("How much money : ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("out of balance.");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Your balance is : " + balance);
                    }
                } while (select != 4);
                System.out.println("Have a nice day.");
                break;
            } else {
                right--;
                System.out.println("Your username or password is wrong, please try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked.");
                } else {
                    System.out.println("You must enter true in : " + right + "times.");
                }
            }
        }
    }
}
