
public class PokemonCasineres extends PokemonsTerre {
	private int nbHeureTeleParJour;

	public PokemonCasineres(PokemonsTerre pokT, int nbHeureTeleParJour) {
		super(pokT.getNom(), pokT.getPoid(), pokT.getNbDePatte(), pokT.getTaille());
		this.nbHeureTeleParJour = nbHeureTeleParJour;
	}

	public int getNbHeureTeleParJour() {
		return nbHeureTeleParJour;
	}

	public void setNbHeureTeleParJour(int nbHeureTeleParJour) {
		this.nbHeureTeleParJour = nbHeureTeleParJour;
	}

	public String toString() {
		return "Je suis le pokemon Casinire " + getNom() + " mon poids est de " + getPoid() + " kg, ma vitesse "
				+ getVitesse() + " Km/h, les nombre d'heure devant la tele parjour " + getNbHeureTeleParJour();
	}

}
