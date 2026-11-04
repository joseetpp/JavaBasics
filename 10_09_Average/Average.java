import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     
        System.out.println("How many numbers do you want to enter?");
        int quantity = scanner.nextInt();
        
        while (quantity <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
            quantity = scanner.nextInt();
        }
        
        double sum = 0.0;
        
        for (int i = 1; i <= quantity; i++) {
            System.out.println("Enter number " + i + ":");
            sum += scanner.nextDouble();
        }
        
        double average = sum / quantity;
        System.out.printf("The average is: %.2f\n", average);
        
        scanner.close();
    }
}