import java.util.Scanner;

public class Throw {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 10: ");
		
		try {
			
			int num = s.nextInt();
			
			if (num < 1 || num > 10) {
				
				throw new NotErros();
			}
		} catch (NotErros e) {
			
			System.out.println(e.getMessage());
		}
		
	}

}
