import java.util.Scanner;
public class xSwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("What day is today (1 to 7)? ");
		int day = scan.nextInt();
		
		switch (day) {
			case 1:
				System.out.println("Today is Sunday");
				break;
			case 2:
				System.out.println("Today is Monday");
				break;
			case 3:
				System.out.println("Today is Tuesday");
				break;
			case 4:
				System.out.println("Today is Wednesday");
				break;
			case 5:
				System.out.println("Today is Thursday");
				break;
			case 6:
				System.out.println("Today is Friday");
				break;
			case 7:
				System.out.println("Today is Saturday");
				break;
			default:
				System.out.println("You should insert a number between 1 and 7");
		}
	}

}
