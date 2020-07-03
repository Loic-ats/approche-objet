package tri;

import java.util.Comparator;

import maps.Ville;

public class ComparatorHabitant implements Comparator<Ville> {

	public ComparatorHabitant() {
		// TODO Auto-generated constructor stub
	}

	// Tri par nombre d'habitant

	public int compare(Ville Ville1, Ville Ville2) {

		if (Ville1.getNbhabitants() > Ville2.getNbhabitants()) {
			return 1;
		} else if (Ville1.getNbhabitants() < Ville2.getNbhabitants()) {
			return -1;
		}
		return 0;
	}

}
