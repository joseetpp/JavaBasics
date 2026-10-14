import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "jupiter4321";

        System.out.println("Enter your password:");
        String password = sc.nextLine();

        if (password.equals(correctPassword)) {
            System.out.println("Access granted. Welcome!");
        } else {
            System.out.println("Incorrect password. Try again.");
            System.out.println("Enter your password:");
            password = sc.nextLine();

            if (password.equals(correctPassword)) {
                System.out.println("Access granted. Welcome!");
            } else {
                System.out.println("Incorrect password. Try again.");
                System.out.println("Enter your password:");
                password = sc.nextLine();

                if (password.equals(correctPassword)) {
                    System.out.println("Access granted. Welcome!");
                } else {
                    System.out.println("Your account is locked. Please contact your administrator.");
                }
            }
        }
    }
}