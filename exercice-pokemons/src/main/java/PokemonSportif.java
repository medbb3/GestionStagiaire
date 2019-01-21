
public class PokemonSportif extends PokemonsTerre {
	private int frequenceCariaque;

	public int getFrequenceCariaque() {
		return frequenceCariaque;
	}

	public void setFrequenceCariaque(int frequenceCariaque) {
		this.frequenceCariaque = frequenceCariaque;
	}

	public PokemonSportif(PokemonsTerre pok, int frequenceCariaque) {
		super(pok.getNom(), pok.getPoid(), pok.getNbDePatte(), pok.getTaille());
		this.frequenceCariaque = frequenceCariaque;
	}

	@Override
	public String toString() {
		return "je suis le pokemon Sprotif " + getNom() + " mon poids est de " + getPoid() + " kg, ma vitesse "
				+ getVitesse() + " Km/h, j'ai " + getNbDePatte() + " patte, ma taille" + getTaille()
				+ " ma frequence cardiaque et de " + getFrequenceCariaque() + " pulasation par minute";
	}

}
