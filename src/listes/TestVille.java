package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestVille {

	public TestVille() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Ville villelaPluspeuple=null;
		Ville villelaMoinspeuple=null;
		String nom = "";

		ArrayList<Ville> list = new ArrayList<>();

		list.add(new Ville("Nice", 343_000));
		list.add(new Ville("Carcassonne", 47_00));
		list.add(new Ville("Narbonne", 53_400));
		list.add(new Ville("Lyon", 484_000));
		list.add(new Ville("Foix", 9_700));
		list.add(new Ville("Pau", 77_200));
		list.add(new Ville("Marseille", 850_700));
		list.add(new Ville("Tarbes", 40_600));

		// Afficher la ville qui a le plus grand nombre d'habitant

		Ville ref = list.get(0);

		for (int i = 0; i < list.size(); i++) {

			Ville ville = list.get(i);
			if (ville.getNbhabitants() > ref.getNbhabitants()) {

				villelaPluspeuple = ville;

			}

		}
		
		System.out.println(villelaPluspeuple);

		// Supprimer la ville la moins peuplé

		for (int i = 0; i < list.size(); i++) {

			Ville ville = list.get(i);
			if (ville.getNbhabitants() < ref.getNbhabitants()) {

				villelaMoinspeuple = ville;

			}

		}
		
		list.remove(villelaMoinspeuple);
		
		System.out.println(villelaMoinspeuple);
		
		//Modifier les villes de plus de 100 000 habitant en mettant leur nom en majuscule
		
		for (Ville ville: list ) {
			if (ville.getNbhabitants()> 100000) {
				ville.setNom(ville.getNom().toUpperCase());
				
			}

			
		}
		
		// Affichage final
		
		System.out.println("Affichage final");
		for (int i= 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		}

	}


