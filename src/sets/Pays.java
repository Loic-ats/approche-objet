package sets;
import org.apache.commons.lang3.builder.EqualsBuilder;

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
	
	
	//Redéfinition méthode Equals
	
	//Etape on vérifie que l'objet placé en paramètre est de même type que l'objet à comparer dans notre cas Pays 
	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Pays)) {
			return false;
		}
		
		//Pour accéder à l'attribut de l'objet que l'on veux comparer on fait un "cast" afin
		//qu'il soit dans le mêle type que l'objet que l'on test dans notre cas Pays.
		
		Pays other = (Pays) obj;
		
		//On compare pour chaques attribut de l'objet pays (nom, nbhabitant, PIBparhabitant si il est différent ceux de l'obj
		// si il est différent la méthode retourne false, sinon si ils sont identique elle retourne true
			
		
		EqualsBuilder builder = new EqualsBuilder ();
		
		boolean resultat = builder.append(this.nom, other.getNom())
								.append  (this.nbhabitant, other.getNbhabitant())
								.append(this.PIBparhabitant, other.getPIBparhabitant())
								.isEquals ();
		
		return resultat;

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
