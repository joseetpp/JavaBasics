import java.util.Scanner;

public class SumToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number (greater than 1):");
        int n = scanner.nextInt();

        while (n <= 1) {
            System.out.println("Enter a number (greater than 1):");
            n = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);

        scanner.close();
    }
}