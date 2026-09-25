import java.util.Scanner;
import java.math.*;

public class SplitElectricityBill{
	public static void main(String[] args){
		System.out.println("Number of people:");
		Scanner sc = new Scanner(System.in);
		int numPeople = sc.nextInt();
		
		System.out.println("Enter electricity consumption (kWh):");
		double kwh = sc.nextDouble();
		
		System.out.println("Enter price per kWh (€):");
		double price = sc.nextDouble();
		
		System.out.println("Enter fixed monthly charge (€):");
		double monthly = sc.nextDouble();		
		
		System.out.println("Enter tax (%):");
		double tax = sc.nextDouble();
		
		double costEnergia = kwh * price;
		double subtotal = costEnergia + monthly;
		double taxAmount = subtotal * (tax / 100.0);
		double total = subtotal + taxAmount;
		double perPerson = total / numPeople;
		
		System.out.printf("Energy cost = %.2f €\n", costEnergia);
		System.out.printf("Fixed charge = %.2f €\n", monthly);
		System.out.printf("Subtotal = %.2f €\n", subtotal);
		System.out.printf("Tax = %.2f €\n", taxAmount);
		System.out.printf("Total = %.2f €\n", total);
		System.out.printf("Total per person = %.2f €\n", perPerson);
	}
}