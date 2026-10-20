import java.util.Scanner;
public class ZombieDetector{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter body temperature:");
		double temperature = sc.nextDouble();
		System.out.println(temperature<30 ? "Zombie detected!" : "Human detected!");
	}
}