import java.util.Scanner;

public class FinallyFinallyFinally {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Type function:");
		
		try {
			
			System.out.println(s.next());
			
		} catch (Exception e) {
			
			System.out.println(e);
			
		} finally {
			
			s.close();
		}
	}

}
