
public class Main {

	public static void main(String[] args) {

		Shoe s = new Shoe("Adidas", 8.5);
		System.out.println("I would like to have a " + s.brand + " shoe, my size is " + s.size);
		
		System.out.println("----------------------------");
		
		Walking w = new Walking(true, "Nike", 9.0);
		System.out.println("Pedro has a " + w.brand + " shoe and his size is " + w.size + ". But I don't know if it's true or not "
				+ "that the shoe is waterproff");
		System.out.println("Don't worry, it's " + w.goreTex);
	}

}
