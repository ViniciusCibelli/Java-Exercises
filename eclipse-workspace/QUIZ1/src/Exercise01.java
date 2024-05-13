import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter username: ");
		String name = scan.next();
		
		System.out.println("Usename is: " + name);
		
		System.out.println("Enter password: ");
		String password = scan.next();
		
		System.out.println("Your password is: " + password);

	}

}
