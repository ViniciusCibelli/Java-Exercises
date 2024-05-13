
public class stringsRNice {

	public static void main(String[] args) {

		String a = "Pikachu";
		String b = "pIkAcHu";
		
		String c = new String("Pokemon");
		String d = new String("Pokemon");
		
		if (a == b) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		if (a.toUpperCase().equals("PIKACHU")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		if (c.equals(d)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
	}

}
