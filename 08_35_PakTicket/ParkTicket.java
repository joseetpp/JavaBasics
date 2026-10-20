import java.util.Scanner;

public class ParkTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println("Is it a weekday? (true/false)");
        boolean weekday = sc.nextBoolean();

        double price = (age < 12) ? (weekday ? 5.00 : 9.00) : (weekday ? 15.00 : 22.00);

        System.out.printf("Ticket price: %.2f €%n", price);

        sc.close();
    }
}