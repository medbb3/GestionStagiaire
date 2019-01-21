import java.util.ArrayList;

public class CollectionPokemon extends ArrayList<Pokemons> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getListe() {
		StringBuilder str = new StringBuilder();
		for (Pokemons pok : this) {
			str.append(pok).append("\n");
		}
		return str.toString();

	}

//	public double vitesseSportif() {
//		List<PokemonSportif> listpoksp = new ArrayList<PokemonSportif>();
//
//		double totale = 0;
//		for (PokemonSportif pok : listpoksp) {
//			double vitesse= double.parseDouble(pok.getVitesse()); 
//			totale = totale + double.parseDouble(pok.getVitesse());
//
//		}
//		double moyenne = totale / listpoksp.size();
//
//		return moyenne;
//
//	}

}