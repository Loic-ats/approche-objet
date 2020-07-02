package listes;

public class Ville {

	private String nom;
	private int nbhabitants;

	//Constructeur de la classe Ville
	public Ville(String nom, int nbhabitants) {
		super();
		this.nom = nom;
		this.nbhabitants = nbhabitants;
	}

	//Generation des getter et des setter
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbhabitants() {
		return nbhabitants;
	}

	public void setNbhabitants(int nbhabitants) {
		this.nbhabitants = nbhabitants;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbhabitants=" + nbhabitants + "]";
	}

}
