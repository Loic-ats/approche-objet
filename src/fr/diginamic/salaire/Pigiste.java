package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	double joursdetravail;
	double montantjournalier;
			
//Constructeur permettant de cr�� une instance de Pigiste utilisant le type'Intervenant' cr�� dans la classe m�re
	
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
