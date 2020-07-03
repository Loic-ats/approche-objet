package maps;

import java.util.ArrayList;

//On veut comparer à  une autre ville donc dans la notation diamant on place ville

public class Ville implements Comparable <Ville> {

	private String nom;
	private int nbhabitants;

	//Constructeur de la classe Ville
	public Ville(String nom, int nbhabitants) {
		super();
		this.nom = nom;
		this.nbhabitants = nbhabitants;
	}
	
	/* Méthode compare to pour effectuer le tri des villes par longueur des chaines
	 * La methode compareTo permet automatiquement de renvoyer -1, 1 ou 0
	 * il est donc pas nécessaire d'écrire tous le test==> valable uniquement quand on veut comparer des strings.
	 */
	
	
	@Override
	//public int compareTo(Ville autre) {
		
	//	int valeur = this.nom.compareTo(autre.getNom());
	//	return	valeur;
				
		
	//}
	
	/* Méthode compare to pour effectuer le tri des villes par taille d'habitant
	 * La methode compareTo permet automatiquement de renvoyer -1, 1 ou 0
	
	 */
	
	public	int compareTo(Ville autre ) {
		
	if (this.nbhabitants > autre.getNbhabitants()) {
	return 1;
	}
	else if	(this.nbhabitants < autre.getNbhabitants()) {
	return	- 1;
	}
	return	0;
	}
	
	//Autre méthode qui fonctionne également (uniquement avec int)
	// public int compareTo (Ville autre) {
	// return this.nbHabitant - autre.getHabitant()){
	//}

	//Generation des getter et des setter
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbhabitants() {
		return nbhabitants;
	}

	public void setNbhabitants(int nbhabitants) {
		this.nbhabitants = nbhabitants;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbhabitants=" + nbhabitants + "]";
	}



}
