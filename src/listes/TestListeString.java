package listes;

import java.util.ArrayList;

public class TestListeString {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Nice");
		list.add("Carcassonne");
		list.add("Narbonne");
		list.add("Lyon");
		list.add("Foix");
		list.add("Pau");
		list.add("Marseille");
		list.add("Tarbes");

		// Afficher la ville qui a le plus grand nombre de carractère
		String reference = list.get(0);

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).length() > reference.length()) {
				reference = list.get(i);
			}

		}

		System.out.println(reference);

		// Retourner le nom des villes en majuscule
		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i).toUpperCase());

		}

		// Supprimer les villes dont la première lettre commence par un "N"
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).charAt(0) == 'N') {

				list.remove(list.get(i));
			}
		}

		System.out.println(list);
	}
}
