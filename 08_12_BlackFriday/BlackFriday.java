import java.util.*;

public class BlackFriday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price:");
        double compra = sc.nextDouble();
        System.out.println("Do you have a loyalty card? (yes/no):");
        sc.nextLine();
        String loyalti = sc.nextLine();

        boolean teTargeta = false;

        if (loyalti.equalsIgnoreCase("yes")) {
            teTargeta = true;
        }
        double descompte = 0;
        if (compra > 60) {
            if (teTargeta) {
                descompte = 0.20; 
            } else {
                descompte = 0.10;
            }
        } else {
            if (teTargeta) {
                descompte = 0.05;
            } else {
                descompte = 0.00; 
            }
        }
        System.out.printf("Final price: %.2f €" ,compra * (1 - descompte));

        sc.close();
    }
}
