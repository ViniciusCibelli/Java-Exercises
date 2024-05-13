class Bird {
	
	public void sing() {
		System.out.println("tweet tweet tweet");
	}
}

class Robin extends Bird {
	
	public void sing() {
		System.out.println("twiddledeedee");
	}
}

class Pelican extends Bird {
	
	public void sing() {
		System.out.println("KWAAH KWAAH KWAAH");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		Bird x = new Bird();
		x.sing();
		
		Robin y = new Robin();
		y.sing();
		
		Pelican z = new Pelican();
		z.sing();
	}

}
