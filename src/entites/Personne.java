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
	
	// Création d'une méthode pour concaténer le nom et le prénom toUpperCase pour tous mettre en majuscule
	
	public String affichage () {
			
		return (nom.toUpperCase() + " " + prenom);
		
	}
	
	// Création d'une méthode pour modifier le nom d'une personne
	
	public void setnom (String mod) {
		
		this.nom = mod;
			
	}
	
	// Création d'une méthode pour modifier le prénom
	
	public void setprenom(String mod2) {
		
		this.prenom=mod2;
	}
	
	public void setadresse (AdressePostale mod3) {
		
		this.adresse = mod3;		
	}
	
	// Méthode qui retourne le nom en type string
	
	public String getname () {
	
		return nom;
	}
	
	// Méthode qui retourne le prenom en type string
	
	public String getprenom () {
	
		return prenom;
		
	}
	
	// Méthode qui retourne l'adresse postale
	
	public AdressePostale getadresse() {
		
		return adresse;
		
	}
	

	
	
	
	}
	
	


