import java.util.Scanner;

public class SplitPositiveNegative{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String pos = "";
		String neg = "";
		
		for(int i = 1; i <=10; i++){
			System.out.println("Enter a number [" + i + "]:");
			String num = sc.nextLine();
			if(Integer.parseInt(num) >= 0){
				pos += num + " ";
			} else {
				neg += num + " ";
			}
		}
		System.out.println("Positive or zero: " + pos);
		System.out.println("Negative: " + neg);

	}
}