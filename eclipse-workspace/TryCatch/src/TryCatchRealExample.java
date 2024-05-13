import java.util.Scanner;

public class TryCatchRealExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("What is your favorite number?");
		
		try {
			
			int n = s.nextInt();
			System.out.println("Your favorite number is: " + n);
			
		} catch (Exception e) {
			
			System.out.println("Something went wrong, please try again.");

		}
	}
}
