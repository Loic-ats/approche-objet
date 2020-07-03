package maps;

import java.util.ArrayList;
import java.util.HashMap;
import maps.Ville;

public class MapCity {

	public MapCity() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		ArrayList<Ville> list = new ArrayList<>();

		list.add(new Ville("Nice", 343_000));
		list.add(new Ville("Carcassonne", 47_00));
		list.add(new Ville("Narbonne", 53_400));
		list.add(new Ville("Lyon", 484_000));
		list.add(new Ville("Foix", 9_700));
		list.add(new Ville("Pau", 77_200));
		list.add(new Ville("Marseille", 850_700));
		list.add(new Ville("Tarbes", 40_600));

		// Copier l'ArrayList "list" dans la HashMap "map"

		HashMap<Ville, String> map = new HashMap<>();

		for (Ville ville : list) {
			map.put(ville, ville.getNom());

		}

		System.out.println(map);

		System.out.println("----------------------------------");

		// Supprimer la ville qui a le moins d'habitant

		int minHabitants = map.values().iterator().next().nbhabitant;
		String villeMoinsPeuplee = "";
		
		for (String key : map.keySet()) {
			int nbhabitant = map.get(key).getnbhabitants();
			if (minHabitants > nbhabitant) {
				minHabitants = nbhabitant;
				villeMoinsPeuplee = key;

			}

		}
		
		map.remove(villeMoinsPeuplee);
		System.out.println(map);
	}
}
