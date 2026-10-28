import java.util.Scanner;
public class binaryConversion{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int quocient;
		int num;
		int residu;
		
		String binari = "";
		System.out.println("Enter a positive number: ");
		num = sc.nextInt();
		
		while(num>0){
			quocient = num / 2;
			residu = num %2;
			
			binari = residu+binari;
			num = num / 2;
		}
		
		System.out.println("Binary "+ binari);
		sc.close();
	}
}