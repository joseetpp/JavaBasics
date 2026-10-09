import java.util.Scanner;

public class Podium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the score of the first athlete:");
        int score1 = scanner.nextInt();
        
        System.out.println("Enter the score of the second athlete:");
        int score2 = scanner.nextInt();
        
        System.out.println("Enter the score of the third athlete:");
        int score3 = scanner.nextInt();
        
        System.out.println("Enter \"asc\" or \"desc\":");
        String order = scanner.next();
        
        int high, mid, low;
		if (score1 >= score2 && score1 >= score3) {
			high = score1;
			if(score2 >= score3){
				mid = score2;
				low = score3;
			} else {
				mid = score3;
				low = score2;
			}
		}else if(score2 >= score1 && score2>=score3){
			high = score2;
			if(score1>= score3){
				mid = score1;
				low = score3;
			}else {
				mid = score3;
				low = score1;
			}
		}else {
			high = score3;
			if(score1>=score2){
				mid = score1;
				low = score2;
			} else {
				mid = score2;
				low = score1;
			}
		}
		if ("asc".equalsIgnoreCase(order)) {
			System.out.printf("Podium: %d %d %d%n", low, mid, high);
		} else if ("desc".equalsIgnoreCase(order)) {
			System.out.printf("Podium: %d %d %d%n", high, mid, low);
		} else {
			System.err.println("Invalid order specified. Please use 'asc' or 'desc'.");
		}
		
        scanner.close();
    }
}