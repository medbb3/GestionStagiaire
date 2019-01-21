import java.text.DecimalFormat;

public class PokemonMer extends PokemonEau {

	public PokemonMer(PokemonEau pokeau) {
		super(pokeau.getNom(), pokeau.getPoid(), pokeau.getNbnagoire());

	}

	public String getVitesse() {
		DecimalFormat df = new DecimalFormat("0.00");
		double vitesse = getPoid() * getNbnagoire() / 25;
		return df.format(vitesse);

	}

	public String toString() {
		return "je suis le pokemon mers " + getNom() + " mon poids est de " + getPoid() + " kg, ma vitesse "
				+ getVitesse() + " Km/h, les nombre de mes nagoire est " + getNbnagoire();
	}

}
