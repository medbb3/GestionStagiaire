
public class Pokemons {
	private String nom;
	private int poid;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPoid() {
		return poid;
	}

	public void setPoid(int poid) {
		this.poid = poid;
	}

	public Pokemons(String nom, int poid) {
		super();
		this.nom = nom;
		this.poid = poid;
	}

}
