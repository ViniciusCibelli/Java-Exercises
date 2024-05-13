import java.util.Scanner;
public class ySwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a dog breed: ");
		String dog = scan.nextLine();
		
		switch(dog) {
			case "shih tzu":
				System.out.println("Small dog");
				break;
			case "pomeranian":
				System.out.println("Small dog");
				break;
			case "bulldog":
				System.out.println("Small dog");
				break;
			case "great dane":
				System.out.println("Large dog");
				break;
			case "husky":
				System.out.println("Large dog");
				break;
			case "golden retriever":
				System.out.println("Large dog");
				break;
			default:
				System.out.println("Try a different dog breed");
		}
	}

}
