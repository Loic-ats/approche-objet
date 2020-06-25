package essais;

import entites.AdressePostale;


public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AdressePostale adresse1 = new AdressePostale ();
		adresse1.numeroRue  = 5; 
		adresse1.libelleRue = "Rue des oliviers";
		adresse1.codePostal = 34830;
		adresse1.ville = "Clapiers";
		
		
		AdressePostale adresse2 = new AdressePostale ();
		adresse2.numeroRue  = 4; 
		adresse2.libelleRue = "Rue des Tulippes";
		adresse2.codePostal = 34000;
		adresse2.ville = "Montpellier";
		
	}

}
