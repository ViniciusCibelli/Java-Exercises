
public class Lambdas {

	public static void main(String[] args) {

		Cat c = new Cat();
		
		c.print();
		
		Printable lambdaPrintable = (s) -> "Meow " + s;
		printThing (lambdaPrintable);
		
	}
	
	static void printThing(Printable thing) {
		thing.print("!");
	}
}
