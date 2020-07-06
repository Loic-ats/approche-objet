package fr.diginamic.recensement;

import java.util.Comparator;
import fr.diginamic.recensement.Ville;

public class ComparatorPopulation implements Comparator <Ville> {

	public ComparatorPopulation() {
		// TODO Auto-generated constructor stub
	}

	// Methode de tri par nombre d'habitant

	public int compare(Ville Ville1, Ville Ville2) {

		if (Application.conversionPopulation(list, Ville1) > Application.conversionPopulation(list, Ville2) {
			return 1;
		} else if (Ville1.getPopulation() < Ville2.getPopulation()) {
			return -1;
		}
		return 0;
	}

}
