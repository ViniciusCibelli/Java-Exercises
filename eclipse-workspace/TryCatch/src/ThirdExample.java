
public class ThirdExample {

	public static void main(String[] args) {

		try {
			
			int[] x = {10};
			System.out.println(x[6]);
			
		} catch(NullPointerException e) {
			
			System.out.println("Your array is null!");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Your index is out of bounds!");
			
		} catch (Exception e) {
			
			System.out.println("Something went wrong!");
			
		}
	}

}
