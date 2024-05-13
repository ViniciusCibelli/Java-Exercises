public class RoleDoSabor {
	
	enum Color {
		BLACK, WHITE, RED, BLUE;
		
		public static void getVanilla() {
			System.out.println(Color.BLUE);
		}
	}

	public static void main(String[] args) {
		
		Color cor = Color.BLUE;
		
		if(cor == cor.BLUE) {
			System.out.println("It's blue");
		} else if(cor == cor.BLACK) {
			System.out.println("It's Black");
		} else if(cor == cor.WHITE) {
			System.out.println("It's White");
		} else if(cor == cor.RED) {
			System.out.println("It's Red");
		}
		
		cor.getVanilla();
		
	}

}
