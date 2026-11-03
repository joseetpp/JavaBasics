import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number > 0:");
        int num = scanner.nextInt();
        
        while (num <= 0) {
            System.out.println("Enter number > 0:");
            num = scanner.nextInt();
        }
        
        String reversed = "";
        
        while (num > 0) {
            int digit = num % 10;   
            reversed += digit;      
            num = num / 10;         
        }
        
        System.out.println(reversed);
        scanner.close();
    }
}