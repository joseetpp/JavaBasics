import java.util.Scanner;

public class Calories{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter calories to burn:");
		int calories = sc.nextInt();
		System.out.println("Enter MET value:");
		float met = sc.nextFloat();
		System.out.println("Enter your weight in kg:");
		float weight = sc.nextFloat();
		
		float formula = (calories * 200) / (met * 3.5f * weight);
		int minuts = (int) formula;
		float segonsF = (formula-(int)minuts) * 60;
		int segons = (int)segonsF;
		
		System.out.printf("Running time: %d:%02d", minuts, segons );
	}
}