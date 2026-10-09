import java.util.Scanner;

public class GradeClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numeric grade (0-100): ");
        int grade = sc.nextInt();

        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade");
        } else if (grade >= 90) {
            System.out.println("A = Excellent");
        } else if (grade >= 70) {
            System.out.println("B = Good");
        } else if (grade >= 60) {
            System.out.println("C = Satisfactory");
        } else if (grade >= 50) {
            System.out.println("D = Pass");
        } else {
            System.out.println("F = Fail");
        }

        sc.close();
    }
}