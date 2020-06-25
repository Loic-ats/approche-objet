package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne perso1 = new Personne ();
		
		perso1.nom = "Bob";
		perso1.prenom = "Eponge";
	
		AdressePostale adresse1 = new AdressePostale ();
		adresse1.numeroRue  = 5; 
		adresse1.libelleRue = "Rue des oliviers";
		adresse1.codePostal = 34830;
		adresse1.ville = "Clapiers";
		perso1.adresse=adresse1;
				
		Personne perso2 = new Personne ();
		
		perso2.nom = "Jean";
		perso2.prenom = "Marie";
		
		AdressePostale adresse2 = new AdressePostale ();
		adresse2.numeroRue  = 4; 
		adresse2.libelleRue = "Rue des Tulippes";
		adresse2.codePostal = 34000;
		adresse2.ville = "Montpellier";
		
		perso2.adresse = adresse2;
	}

}
