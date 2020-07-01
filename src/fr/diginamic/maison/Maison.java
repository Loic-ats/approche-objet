package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {

	private double tailletotale;
	private double tailletotale0;
	private double tailletotale1;

	private Piece tab[] = new Piece[0];

	public Maison() {
		super();
		this.tab = new Piece[0];
	}

	public void ajouterPiece(Piece newPiece) {
		// if (newPiece != null && newPiece.getSuperficie() >= 1) { // Condition pour
		// éviter paramètre Null / superficie 0 ou négative
		Piece[] myNewTab = Arrays.copyOf(this.tab, this.tab.length + 1);
		myNewTab[myNewTab.length - 1] = newPiece;
		this.tab = myNewTab;
		// } else {
		// System.out.println("ERREUR : caractéristiques de pièce éronnés.");
		// }
	}

	public void afficherTab() {

		for (int i = 0; i < tab.length; i++) {

			System.out.println(tab[i].toString());
		}

	}
	// Méthode pour connaitre la superficie de la maison

	public double superficietotale() {

		tailletotale = 0;
		for (int i = 0; i < tab.length; i++) {

			tailletotale = tailletotale + tab[i].getSuperficie();

		}

		return tailletotale;
	}

	// Méthode pour calculer la superfice par etage de la maison
	
	
	public double superficieparetage(int numeroetage) {

		tailletotale = 0;
		
		for (int i = 0; i < tab.length; i++) {

			if (tab[i].getNumeroetage() == numeroetage) {
				
				tailletotale = tailletotale + tab[i].getSuperficie();
		
		}
		
		
	}
		return tailletotale; 
}
	
	public double superficieparetypedepiece(String typepiece) {

		tailletotale = 0;
		
		for (int i = 0; i < tab.length; i++) {

			if (typepiece != null && typepiece.equals(this.tab[i].getType())) {
				
				tailletotale = tailletotale + tab[i].getSuperficie();
				}
		
		
	}
		return tailletotale; 
}
	
}
