import java.util.Scanner;

public class Astrophotography{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Free space in MB:");
		int espaceMb = sc.nextInt();
		
		System.out.println("Battery level in %:");
		int batteryLevel = sc.nextInt();
		
		System.out.println("Humidity in %:");
		int humidity = sc.nextInt();
		
		System.out.println("Wind speed in km/h:");
		int windSpeed = sc.nextInt();
		
		System.out.println("Connected to external power (true/false):");
		boolean externalPower = sc.nextBoolean();
		
		boolean ready = espaceMb>=250 && (batteryLevel >=20 || externalPower) && humidity<=60 && windSpeed<=10;
		System.out.printf("Ready to take photo: " + ready);
	}
}
