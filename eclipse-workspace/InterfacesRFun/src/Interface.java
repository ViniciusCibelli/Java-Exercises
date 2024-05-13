//interfaces assume that all methods are abstracts. We don't use extends but we use implements (key word)

interface WaterBottle {

	String color = "Blue";
	
	void fillUp();
	
}


public class Interface implements WaterBottle {

	public static void main(String[] args) {

		System.out.println("The water bottle is " + color + ".");
		
		Interface ex = new Interface();
		ex.fillUp();
		
	}

	@Override
	public void fillUp() {

		System.out.println("The water bottle is filled.");
	}

}
