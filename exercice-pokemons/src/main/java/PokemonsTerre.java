import java.text.DecimalFormat;

public class PokemonsTerre extends Pokemons {
	private int nbDePatte;
	private double taille;

	public int getNbDePatte() {
		return nbDePatte;
	}

	public void setNbDePatte(int nbDePatte) {
		this.nbDePatte = nbDePatte;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public String getVitesse() {
		DecimalFormat df = new DecimalFormat("0.00");
		double vitesse = nbDePatte * taille * 3;
		return df.format(vitesse);
	}

	public PokemonsTerre(String nom, int poid, int nbDePatte, double taille) {
		super(nom, poid);
		this.nbDePatte = nbDePatte;
		this.taille = taille;
	}

}
