
public class Methods {

	public static void main(String[] args) {
		welcome();
		
		multiply(5, 10);
		
		divide(4, 2);
		
		add(5, 5); //coment with doble slash
	}
	
	public static void welcome() {
		System.out.println("Welcome to calculator!");
	}

	public static void multiply(int a, int b) {
		System.out.println(a * b);
	}
	
	public static void divide(int c, int d) {
		System.out.println(c / d);
	}
	
	public static void add(int e, int f) {
		System.out.println(e + f);
	}
}
