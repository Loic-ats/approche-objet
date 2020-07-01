package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	
	double montantsalaire;
	
	
	//Constructeur permettant de cr�� une instance de salari� reprenant le type 'Intervenant' cr�� dans la clase m�re
	
	public Salarie(String nom, String prenom,String statut, double montantsalaire) {
		super ( nom,prenom,statut);
		this.montantsalaire = montantsalaire;
	}
		
		
	@Override
	public double getSalaire() {
		double salaire = montantsalaire;
		return salaire;
	}

}
