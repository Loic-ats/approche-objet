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
		double salaire = montantsalaire;
		return salaire;
	}

}
