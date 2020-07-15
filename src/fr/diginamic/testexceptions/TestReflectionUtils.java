package fr.diginamic.testexceptions;

import sets.Pays;

public class TestReflectionUtils {

	public static void main(String[] args) throws Exception {

		Pays Italie = new Pays("Italie", 603600000, 34483.20);

		try {
			ReflectionUtils.afficherAttributs(null);
		} catch ( IllegalArgumentException | IllegalAccessException | ReflectionException e) {
			System.out.println(e.getMessage());
		} 
		
		try {
			ReflectionUtils.afficherAttributs(null);
		} catch ( IllegalArgumentException | IllegalAccessException | ReflectionException e) {
			System.err.println("L'erreur est ici");
		}


	}

}
