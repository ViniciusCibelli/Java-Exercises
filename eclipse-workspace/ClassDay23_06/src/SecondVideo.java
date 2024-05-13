
public class SecondVideo {
	
	//static int z = 24;

	public static void main(String[] args) {
		int z = 24;
		
		
		if (z == 24) {
			int x = 123;
			
			System.out.println(z); //Here is possible to print z, because it is within the biggest scope
			System.out.println(x); //Here is possible to print x, because it is within the scope
		}
		
		System.out.println(z); //It's impossible to print x, because it is out of scope
			
	}
	
}
