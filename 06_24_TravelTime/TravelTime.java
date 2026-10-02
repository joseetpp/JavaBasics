import java.util.Scanner;

public class TravelTime{
	public static void main(String[] args){
		final int timeStops = 3;
		final int timeTransfers = 6;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number of stops:");
		int stops = sc.nextInt();
		
		System.out.println("Number of transfers:");
		int transfer = sc.nextInt();
		
		int totalMinuts = (stops * timeStops) + (transfer * timeTransfers);
		int totalSegons = totalMinuts * 60;
		
		int hores = totalSegons / 3600;
		int segonsRestants = totalSegons % 3600;
		int minuts = segonsRestants / 60;
		
		
		System.out.printf("Total traveling time is %02d:%02d", hores, minuts);
		
	}
}