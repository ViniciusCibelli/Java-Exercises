package iFElse;
import java.util.Scanner;

public class iFElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Grade: ");
		int x = scan.nextInt();
		
		
		if(x >= 90 && x <= 100) {
			System.out.println("A");
		} 
		else if (x >= 80 && x < 90) {
			System.out.println("B");
		}
		else if (x >= 70 && x < 80) {
			System.out.println("C");
		}
		else if (x >= 65 && x < 70) {
			System.out.println("D");
		}
		else if (x >= 0 && x < 65) {
			System.out.println("F");
		}
		else {
			System.out.println("This value is not valid");
		}
	}
}
