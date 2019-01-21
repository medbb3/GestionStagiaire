
public class Main {

	public static void main(String[] args) {
		PokemonsTerre pokTerre1 = new PokemonsTerre("Pikatchu", 18, 2, 0.85);
		PokemonSportif pikatchu = new PokemonSportif(pokTerre1, 120);
		System.out.println(pikatchu);
		System.out.println("**********************");
		PokemonsTerre pokTerre2 = new PokemonsTerre("Salamech", 12, 2, 0.65);
		PokemonCasineres salamech = new PokemonCasineres(pokTerre2, 8);
		System.out.println(salamech);
		System.out.println("**********************");
		PokemonEau pokEau1 = new PokemonEau("Redoudou", 45, 2);
		PokemonMer redoudou = new PokemonMer(pokEau1);
		System.out.println(redoudou);
		System.out.println("**********************");

		PokemonEau pokEau2 = new PokemonEau("Bulbizarre", 15, 3);
		PokemonCroisiere bulbizarre = new PokemonCroisiere(pokEau2);
		System.out.println(bulbizarre);
		System.out.println("**********************");

		CollectionPokemon collectionlistepok = new CollectionPokemon();
		collectionlistepok.add(pikatchu);
		collectionlistepok.add(salamech);
		collectionlistepok.add(redoudou);
		collectionlistepok.add(bulbizarre);
		String str = collectionlistepok.getListe();
		System.out.println(str);

	}

}
