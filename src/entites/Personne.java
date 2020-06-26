package entites;

public class Personne {

	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	public Personne (String nom, String prenom) {
		
		this.nom = nom;
		this.prenom = prenom;
		
		}
	
	public Personne (String nom, String prenom,AdressePostale adresse) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.adresse= adresse;
	}
	
	// Cr�ation d'une m�thode pour concat�ner le nom et le pr�nom toUpperCase pour tous mettre en majuscule
	
	public String affichage () {
			
		return (nom.toUpperCase() + " " + prenom);
		
	}
	
	// Cr�ation d'une m�thode pour modifier le nom d'une personne
	
	public void setnom (String mod) {
		
		this.nom = mod;
			
	}
	
	// Cr�ation d'une m�thode pour modifier le pr�nom
	
	public void setprenom(String mod2) {
		
		this.prenom=mod2;
	}
	
	public void setadresse (AdressePostale mod3) {
		
		this.adresse = mod3;		
	}
	
	// M�thode qui retourne le nom en type string
	
	public String getname () {
	
		return nom;
	}
	
	// M�thode qui retourne le prenom en type string
	
	public String getprenom () {
	
		return prenom;
		
	}
	
	// M�thode qui retourne l'adresse postale
	
	public AdressePostale getadresse() {
		
		return adresse;
		
	}
	

	
	
	
	}
	
	


