
public class zombiekiller {

	public static void main(String[] args) {

		System.out.println("Welcome to Pokemon World!!!");
		
		String pokeballs[] = {
			"Pokeball", "Great Ball", "Ultra Ball"	
		};
		
		String pokemons[] = {
			"Charmander", "Squirtle", "Bubassaur"	
		};
		
		int PokemonHate[] = {
				4, 159, 567, 65, 1, 258, 70
		};
		
		System.out.println("Pokeballs Types:");
		for (int i = 0; i <= 2; i++) {
			System.out.println(pokeballs[i]);
		}
		
		System.out.println("Pokemon Types:");
		for (int i = 0; i <= 2; i++) {
			System.out.println(pokemons[i]);
		}
	}

}
