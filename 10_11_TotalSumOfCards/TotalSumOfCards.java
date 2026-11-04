import java.util.Scanner;

public class TotalSumOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jugador1 = 0;
        int jugador2 = 0;
        
        for (int i = 1; i <= 2; i++) {
            System.out.println("PLAYER " + i);
            
            for (int j = 1; j <= 4; j++) {
                System.out.println("Enter the value of card " + j + " for player " + i + ":");
                int carta = sc.nextInt();
                
                while (carta < 1 || carta > 12) {
                    System.out.println("Wrong card, please enter 1..12:");
                    carta = sc.nextInt();
                }
                
                if (i == 1) {
                    jugador1 += carta;
                } else {
                    jugador2 += carta;
                }
            }
            System.out.println();
        }
        
        System.out.println("RESULTS");
        System.out.println("Total cards Player 1: " + jugador1);
        System.out.println("Total cards Player 2: " + jugador2);
        
        if (jugador1 == jugador2) {
            System.out.println("It is a draw.");
        } else if (jugador1 > jugador2) {
            System.out.println("Player 1 has won!");
        } else {
            System.out.println("Player 2 has won!");
        }

        sc.close();
    }
}