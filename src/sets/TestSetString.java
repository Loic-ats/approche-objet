package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");

// Afficher le pays qui a le plus grand nombre de caractère

		int nombrecaracteretop = 0;
		int nombrecaractere = 0;
		String villetop = "null";

		for (String ville : set) {

			nombrecaractere = ville.length();

			if (nombrecaractere > nombrecaracteretop) {

				nombrecaracteretop = nombrecaractere;
				villetop = ville;
			}
		}

		System.out.println(nombrecaracteretop);
		System.out.println(villetop);
		
		//Supprimer le pays avec le plus grand nombre de caractère
		
		set.remove(villetop);
		System.out.println(set);
	}

}
