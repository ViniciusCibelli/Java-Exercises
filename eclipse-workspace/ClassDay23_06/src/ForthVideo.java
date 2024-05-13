import java.util.Scanner;

public class ForthVideo {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) { //something + name = new something --> declaring an object
			
		
		System.out.println("What is your favorite game?");
		String game = scan.next();
		game += scan.nextLine();
		
		System.out.println("How many hours do play " + game + " per day?");
		int hours = scan.nextInt();
		
		if (hours >= 6) {
			System.out.println("WOW!! Take a rest!!");
		}
		
		else {
			System.out.println("You are doing good! Do not exagerate!!");
		}
		}
	}

}
