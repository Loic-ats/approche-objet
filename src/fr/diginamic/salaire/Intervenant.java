package fr.diginamic.salaire;

public abstract class Intervenant {

	 private String nom;
	 private String prenom;
	 private String statut;
	
	
	//Constructeur permettant de générer un profil Pigiste ou salarié
		
	public Intervenant(String nom, String prenom, String statut) {
		this.nom = nom;
		this.prenom = prenom;
		this.statut = statut;
		
	}
	
	public abstract String afficherDonnees();

	public abstract double getSalaire ();

	
	//Generation des getter et des setter
	
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


	public String getStatut() {
		return statut;
	}


	public void setStatut(String statut) {
		this.statut = statut;
	}
		
}
