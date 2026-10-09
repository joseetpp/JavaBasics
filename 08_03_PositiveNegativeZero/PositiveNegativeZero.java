import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter an integer:");
        int number = scanner.nextInt();
        
        if (number > 0) {
            System.out.println("The number " + number + " is positive");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative");
        } else {
            System.out.println("The number " + number + " is zero");
        }
        
        scanner.close();
    }
}