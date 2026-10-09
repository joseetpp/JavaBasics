import java.util.Scanner;

public class HighestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the score of the first player:");
        int score1 = scanner.nextInt();
        
        System.out.println("Enter the score of the second player:");
        int score2 = scanner.nextInt();
        
        System.out.println("Enter the score of the third player:");
        int score3 = scanner.nextInt();
        
        System.out.println("Enter the score of the fourth player:");
        int score4 = scanner.nextInt();

        int highest = score1;
        
        if (score2 > highest) {
            highest = score2;
        }
        
        if (score3 > highest) {
            highest = score3;
        }
        
        if (score4 > highest) {
            highest = score4;
        }
        
        System.out.println("The highest score is: " + highest);
        
        scanner.close();
    }
}