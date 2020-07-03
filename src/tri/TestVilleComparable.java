package tri;

import java.util.ArrayList;
import java.util.Collections;

import maps.Ville;

public class TestVilleComparable {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Ville> list = new ArrayList<>();

		list.add(new Ville("Nice", 343_000));
		list.add(new Ville("Carcassonne", 47_00));
		list.add(new Ville("Narbonne", 53_400));
		list.add(new Ville("Lyon", 484_000));
		list.add(new Ville("Foix", 9_700));
		list.add(new Ville("Pau", 77_200));
		list.add(new Ville("Marseille", 850_700));
		list.add(new Ville("Tarbes", 40_600));
		
		//Tri des villes par le nombre des caract�res (adequation avec CompareTo de la classe ville
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		System.out.println("------------------------------------------------------");
		
		//Afficher les villes par nombre d'habitant
		
		ComparatorHabitant CH = new ComparatorHabitant();
		
		
		Collections.sort(list,CH);
		for (Ville v : list) {
		System.out.println(v);
	}
		
		
		System.out.println("------------------------------------------------------");
		
		
		//Afficher les villes par nombre de carract�re
		
		//On cr�er une instance du Comparator afin de pouvoir appeler la m�thode sort()
		ComparatorNom CN = new ComparatorNom ();
		Collections.sort(list,CN);
		
		// On r�alise une boucle for afin d'afficher les r�sultats de la liste tri�e
		for (Ville v : list) {
		System.out.println(v);
	}

}
}
