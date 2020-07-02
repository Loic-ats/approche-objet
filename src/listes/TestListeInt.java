package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {

	public TestListeInt() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();

		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(5);

		System.out.println(list);

		// Afficher la taille de la liste
		System.out.println(list.size());

		// Permet d'obtenir la valeur maximal d'une Arraylist
		Object top = Collections.max(list);
		System.out.println(top);

		// Permet d'obtenir le plus petit élément d'une Arraylist

		Object small = Collections.min(list);
		System.out.println(small);

		// Supprimer le plus petit élément d'une Arraylist

		list.remove(small);
		System.out.println(list);

		// Retrouver tous les éléments négatif d'une arraylist

		for (int i = 0; i < list.size(); i++) {

			int element = list.get(i);

			if (element < 0) {
				list.set(i, -1 * element);

			}
		}
		System.out.println(list);
	}

}
