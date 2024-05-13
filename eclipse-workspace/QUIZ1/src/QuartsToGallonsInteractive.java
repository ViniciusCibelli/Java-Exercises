import java.util.Scanner;

public class QuartsToGallonsInteractive {
	
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			final int QUARTS_IN_GALLON = 4;
			//int quartsNeeded, gallonsNeeded, extraQuartsNeeded
			int gallonsNeeded;
			int extraQuartsNeeded;
			
			System.out.println("Enter quarts needed ");
			int quartsNeeded = scan.nextInt();
			//quartsNeeded = scan.nextInt();
			
			gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
			extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
			  
			System.out.println("A job that needs " + quartsNeeded +
			    " quarts requires " + gallonsNeeded + " gallons plus " +
			    extraQuartsNeeded + " quarts.");
		} 
	   }
}
