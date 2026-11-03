import java.util.Scanner;

public class GuessNumberDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET_NUMBER = 57;
        int attempts = 0;
        int num;

        do {
            System.out.println("Enter a number between 1 and 100:");
            num = scanner.nextInt();
            attempts++;

            if (num < 1) {
                System.out.println("At least 1!");
            } else if (num > 100) {
                System.out.println("At most 100!");
            } else if (num < SECRET_NUMBER) {
                System.out.println("It's greater than " + num);
            } else if (num > SECRET_NUMBER) {
                System.out.println("It's smaller than " + num);
            } else {
                System.out.println("You guessed it!");
            }
        } while (num != SECRET_NUMBER);

        System.out.println("Attempts: " + attempts);
        scanner.close();
    }
}