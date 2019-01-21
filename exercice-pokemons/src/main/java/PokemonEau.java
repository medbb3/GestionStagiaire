
public class PokemonEau extends Pokemons {

	private int nbNagoire;

	public PokemonEau(String nom, int poid, int nbNagoire) {
		super(nom, poid);
		this.nbNagoire = nbNagoire;

	}

	public int getNbnagoire() {
		return nbNagoire;
	}

	public void setNbnagoire(int nbnagoire) {
		this.nbNagoire = nbnagoire;
	}

}
