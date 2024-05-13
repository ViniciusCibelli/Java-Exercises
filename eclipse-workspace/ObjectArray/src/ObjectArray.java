class Pokemon {
	
	String type = "Super Pikachu";
	
	public static void impokemon() {
		System.out.println("I am a pokemon");
	}
			
}

public class ObjectArray {

	public static void main(String[] args) {

		Pokemon Charmander = new Pokemon();
		Pokemon Squirtle = new Pokemon();
		Pokemon Bubassaur = new Pokemon();
		
		Pokemon[] pokemons = {Charmander, Squirtle, Bubassaur};
		for (Pokemon p : pokemons) {
			p.impokemon();
		}
	}

}
