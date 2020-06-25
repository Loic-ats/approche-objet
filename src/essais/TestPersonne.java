package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Personne perso1 = new Personne ("Bob", "Eponge");

		AdressePostale adresse1 = new AdressePostale(5,"Rue des Olivier",34830,"Clapiers");
		
		Personne perso2 = new Personne ("Jean", "Marie",adresse1);

		
			
	//Appel de la méthode affichage pour afficher le nom et le prénom de perso1
		
		String resultat = perso1.affichage();
		System.out.println(resultat);
		
		perso1.modifnom ("Jean");
		perso1.modifprenom("Paul");
		perso1.modifadresse(adresse1);
		
		resultat = perso1.affichage();
		System.out.println(resultat);
		
		System.out.println(perso1.viewadresse());
	}

}
