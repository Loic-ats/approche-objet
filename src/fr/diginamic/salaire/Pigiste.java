package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	double joursdetravail;
	double montantjournalier;
			
//Constructeur permettant de créé une instance de Pigiste utilisant le type'Intervenant' créé dans la classe mère
	
	public Pigiste(String nom, String prenom,String statut, double joursdetravail, double montantjournalier) {
		super(nom,prenom,statut);
		this.joursdetravail = joursdetravail;
		this.montantjournalier = montantjournalier;
	}

	@Override
	public double getSalaire() {
		double salaire = joursdetravail * montantjournalier;
		return salaire;
	}

}
