package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Personne perso1 = new Personne ("Bob", "Eponge");

		AdressePostale adresse1 = new AdressePostale(5,"Rue des Olivier",34830,"Clapiers");
		
		Personne perso2 = new Personne ("Jean", "Marie",adresse1);

		
	}

}
