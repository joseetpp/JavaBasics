import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Monthly electricity cost:");
        float electricityCost = sc.nextFloat();

        System.out.println("Monthly coffee machine rental cost:");
        float rentalMachine = sc.nextFloat();

        System.out.println("Number of coffees:");
        int numCoffees = sc.nextInt();

        System.out.println("Average coffee price:");
        float coffeePrice = sc.nextFloat();

        System.out.println("Coffee price per kilo:");
        float coffeePriceKilo = sc.nextFloat();

        System.out.println("Kilograms of coffee:");
        float kgCoffee = sc.nextFloat();

        System.out.println("Milk price per litre:");
        float milkPriceLitre = sc.nextFloat();

        System.out.println("Liters of milk:");
        float litersMilk = sc.nextFloat();

        // Expressió booleana única
        boolean isProfitable = (numCoffees * coffeePrice) > (electricityCost + rentalMachine + (coffeePriceKilo * kgCoffee) + (milkPriceLitre * litersMilk));

        System.out.println("Should we buy the coffee machine? " + isProfitable);

        sc.close();
    }
}