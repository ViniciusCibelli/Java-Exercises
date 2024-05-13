class Outside {
	int x = 3;
	
	class Inside {
		int y = 6;
	}
}


public class innerStellar {

	public static void main(String[] args) {

		Outside m = new Outside();
		Outside.Inside n = m.new Inside();
		System.out.println(m.x + " " + n.y);
		
		
	}

}
