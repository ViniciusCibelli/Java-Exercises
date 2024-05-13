import java.util.Scanner;

public class BookstoreCredit {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
			
		
		System.out.println("What is your name?");
		String name = scan.next();
		name += scan.nextLine();
		
		System.out.println("What is your GPA");
		double gpa = scan.nextDouble();
		
		computeDiscount(name, gpa);
	}
        
    public static void computeDiscount(String name, double gpa) {
    	
        double credit = 10 * gpa;
        System.out.println(name + ", your GPA is " + gpa + ", so your credit is $" + credit);
    }

}
