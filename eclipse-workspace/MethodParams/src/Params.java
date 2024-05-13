public class Params {
	
	public static void main(String[] args) {
		
		sayHI();
		sayName();
		saySomething("Vinicius");
		saySomething("Cibelli");
		sayInfo("Titus", 21);
		sayInfo("Pedro", 38);
		
		System.out.println(add(1, 9));
		
		int result01 = add(6,8);
		int result02 = add(48,8);
		int result03 = add(6,93);
		
		System.out.println(result01);
		System.out.println(result02);
		System.out.println(result03);
		
	}
	
	public static void sayHI() {
		System.out.println("hi");
	}
	
	public static void sayName() {
		System.out.println("Vinicius");
	}
	
	public static void saySomething(String x) {
		System.out.println(x);
	}

	public static void sayInfo(String name, int age) {
		System.out.println(name + " is " + age + " years old.");
	}
	
	public static int add(int m, int n) {
		return m + n;
	}
}