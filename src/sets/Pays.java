package sets;

public class Pays {

	private String nom;
	private double nbhabitant;
	private double PIBparhabitant;
	
	//Constructeur de la classe Pays
	
	public Pays(String nom, int nbhabitant, double pIBparhabitant) {
		super();
		this.nom = nom;
		this.nbhabitant = nbhabitant;
		PIBparhabitant = pIBparhabitant;
	}
		
	//Getter  et Setter de la classe Pays
	


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getNbhabitant() {
		return nbhabitant;
	}

	public void setNbhabitant(int nbhabitant) {
		this.nbhabitant = nbhabitant;
	}

	public double getPIBparhabitant() {
		return PIBparhabitant;
	}

	public void setPIBparhabitant(double pIBparhabitant) {
		PIBparhabitant = pIBparhabitant;
	}
	
	//Affichage de l'objet Pays
	@Override
	public String toString() {
		return  nom + ", nbhabitant=" + nbhabitant + ", PIBparhabitant=" + PIBparhabitant + "]";
	}
	
	

}
