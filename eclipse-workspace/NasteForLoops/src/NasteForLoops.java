
public class NasteForLoops {

	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {
			System.out.println(i);
		}
		
		System.out.println("-----------");
		
		String[] pokemon = {"Charmander", "Bubassaur", "Squirtle"};
		
		for (int i = 0; i < 3; i++) {
			System.out.println(pokemon[i]);
		}
		
		System.out.println("-----------");
		
		String[] [] rarePokemons = { {"Charmander", "Bubassaur", "Squirtle"},
				{"Metagross", "Salamance", "Dragonite"}
				
		};
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(rarePokemons[i][j]);
			}
		}
	}

}
