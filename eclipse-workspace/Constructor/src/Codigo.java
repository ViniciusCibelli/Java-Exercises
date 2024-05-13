
public class Codigo {

	public  String brand;
	public  String color;
	
	Codigo() {}
	
	Codigo(String newBrand, String newColor) {
		brand = newBrand;
		color = newColor;
	}
	
	public static void turnOn() {
		System.out.println("The computer is turned on!");
	}
	
	public static void turnOff() {
		System.out.println("The computer is turned off!");
	}
	
	public void setBrand(String newBrand) {
		brand = newBrand;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
}