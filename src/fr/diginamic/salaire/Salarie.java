package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	
	double montantsalaire;
	
	
	//Constructeur permettant de créé une instance de salarié reprenant le type 'Intervenant' créé dans la clase mère
	
	public Salarie(String nom, String prenom,String statut, double montantsalaire) {
		super ( nom,prenom,statut);
		this.montantsalaire = montantsalaire;
	}
		
		
	@Override
	public double getSalaire() {
		return montantsalaire;
	}


	@Override
	public String afficherDonnees() {
		
		return "Le nom et le prenom du salarie est " + getNom() + " " + getPrenom() +  "," + "son statut est " + getStatut() + " son salaire est de " + montantsalaire + "€";
	}
	

}
