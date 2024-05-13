enum Level {  //WE USE ENUM TO THINGS THAT DO NOT CHANGE
	LOW, MEDIUM, HARD
}

public class LetsDoEnums {
	
	static String[] levels = {"Low", "Medium", "Hard"};

	public static void main(String[] args) {
	
		Level one = Level.LOW;
		Level two = Level.MEDIUM;
		Level three = Level.HARD;
	
		switch(one) {
			case LOW:
				System.out.println("Low Level");
				break;
			case MEDIUM:
				System.out.println("Low Medium");
				break;
			case HARD:
				System.out.println("Low Hard");
				break;
		}
		
	}

}
