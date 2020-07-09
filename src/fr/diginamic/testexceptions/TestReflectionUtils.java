package fr.diginamic.testexceptions;

import sets.Pays;

public class TestReflectionUtils {

	public static void main(String[] args) throws Exception {

		Pays Italie = new Pays("Italie", 603600000, 34483.20);

		
		try {
			ReflectionUtils.afficherAttributs(null);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
