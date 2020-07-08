package sets;
import java.util.HashSet;

import sets.Pays;

public class TestSetObjet {


	public static void main(String[] args) {
		
		HashSet<Pays> set = new HashSet<Pays>();
		
		set.add(new Pays("USA", 328_000_000, 67794.59));
		set.add(new Pays("France", 67_000_000, 41463.64));
		set.add(new Pays("Allemagne", 83_000_000, 47603.03));
		set.add(new Pays("UK", 66_650_000, 42943.90));
		set.add(new Pays("Italie", 60_500_000, 34483.20 ));
		set.add(new Pays("Japon", 126_500_000, 39289.96));
		set.add(new Pays ("Chine", 1_393_000_000,9770.83));
		set.add(new Pays ("Russie", 144_500_000,1128.87));
		set.add(new Pays ("Inde", 1_353_000_000,2009.98));

		//Rechercher le Pays avec le PIB/Habitant le plus important
		
		double PIBtop = 0.0;
		Pays paysetop= null;

		for (Pays pays : set) {
			
			if (pays.getPIBparhabitant() > PIBtop) {

				PIBtop = pays.getPIBparhabitant();
				paysetop =  pays;
				
			}
		}

		System.out.println(PIBtop);
		System.out.println(paysetop);
		
		//Recherche le Pays avec le PIB total d'un pays (on aurait pu créer une méthode dans la classe pays et l'invoquer ici)
		
		double PIBtotaletop = 0.0;
		Pays paysePIBtotaltop= null;

		for (Pays pays : set) {
			
			if (pays.getPIBparhabitant() * pays.getNbhabitant() > PIBtotaletop) {

				PIBtotaletop = pays.getPIBparhabitant() * pays.getNbhabitant();
				paysePIBtotaltop =  pays;
				
			}
		}

		System.out.println(PIBtotaletop);
		System.out.println(paysePIBtotaltop);
		
		// Modifier le Hash set pour mettre en majuscule le pays qui a le PIB total le plus petit
		
		
		HashSet<Pays> setmodif = new HashSet<Pays>();
		
		double PIBtotalesmall = PIBtotaletop;
		Pays paysePIBtotalsmall= null;

		for (Pays pays : set) {
			
			if (pays.getPIBparhabitant() * pays.getNbhabitant() < PIBtotalesmall) {

				PIBtotalesmall = pays.getPIBparhabitant() * pays.getNbhabitant();
				paysePIBtotalsmall =  pays;
				
			}

			paysePIBtotalsmall.getNom().toUpperCase();
				
			}
			
		
		//Supprimer le pays dont le PIB total est le plus petit
		
		set.remove(paysePIBtotalsmall);
		
		System.out.println(PIBtotalesmall);
		System.out.println(paysePIBtotalsmall);
		System.out.println(paysePIBtotalsmall.getNom().toUpperCase());
		System.out.println(set);

	}

}
