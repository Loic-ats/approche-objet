package listes;

import java.util.ArrayList;

public class CreationListe {


	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			list.add(i);

		}
		
		System.out.println(list);
		System.out.println(list.size());
	}

}
