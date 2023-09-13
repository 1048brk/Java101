package LoginVerify;

import java.util.Scanner;

public class LoginVerify {
    public static void main(String[] args) {
        String userName, passWord, selection, newPassword;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your username: ");
        userName = input.nextLine();
        System.out.print("Please enter your password: ");
        passWord = input.nextLine();

        //If everything is ok
        if (userName.equals("patika") && passWord.equals("java123")) {
            System.out.println("You logged in successfully.");

            //If both of them are wrong
        } else if (!(userName.equals("patika")) && !(passWord.equals("java123"))) {
            System.out.println("Please verify your information");

            // If username is true but password is false
        } else if (userName.equals("patika") && (!passWord.equals("java123"))) {
            System.out.println("wrong password!!!");
            System.out.print("Do you want to change your password? \n To create a new password : 'Y' \n To leave the program:'N'");
            selection = input.nextLine();
            if (selection.equalsIgnoreCase("Y")) {
                System.out.print("Please enter your new password(it must be different from the last one):");
                newPassword = input.nextLine();
                if (!newPassword.equals("java123")) {
                    System.out.println("You changed your password successfully.");
                } else {
                    System.out.println("Your new password must be different from the last one!");
                }
            } else if (selection.equalsIgnoreCase("N")) {
                System.out.println("You are leaving from the program.");

            } else {
                System.out.println("Please enter only Y or N");
            }
        }

    }
}
