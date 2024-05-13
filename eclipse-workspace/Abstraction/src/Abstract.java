//abstract helps us to organize what which class need to do.

abstract class Dog {
	
	public void bark() {
		System.out.println("Au-Au!");
	}
	
	public abstract void poop();
}

class Shitzu extends Dog {
	
	public void poop() {
		System.out.println("Dog pooped");
	}
}

public class Abstract {

	public static void main(String[] args) {

		Shitzu s = new Shitzu();
		
		s.bark();
		s.poop();
		
	}

}
