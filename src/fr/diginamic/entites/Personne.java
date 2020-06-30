package fr.diginamic.entites;

// Attribut de type personne pour la classe CompteBancaire

public class Personne {

	public String nom;
	public String prenom;
	
		
	public Personne (String nom, String prenom) {
		
		this.nom = nom;
		this.prenom = prenom;
	
		
		}
	
	
		
	@Override
	public String toString() {
		return ", nom = " + nom + " prenom = " + prenom ;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}
