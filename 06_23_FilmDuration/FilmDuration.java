import java.util.Scanner;

public class FilmDuration{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Frames per second (fps):");
		int fps = sc.nextInt();
		
		System.out.println("Duration of film in minutes:");
		int minuts = sc.nextInt();
		//Consumimos el enter
		sc.nextLine();
		
		System.out.println("Name of the film:");
		String name = sc.nextLine();
		
		int duration = minuts * 60;
		
		int frames = fps * duration;
		
		System.out.println("Total frames of film \"" + name + "\" is " + frames );
	}	
// }