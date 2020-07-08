package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {

		// Pour chronométrer le code début

		long debut1 = System.currentTimeMillis();

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i <= 100000; i++) {
			builder.append(i);

			// Fin du choronométrage
			long fin1 = System.currentTimeMillis();

			long debut2 = System.currentTimeMillis();

			String nombre = "null";

			for (i = 1; i < 100000; i++) {
				nombre = nombre + i;

			}
			long fin2 = System.currentTimeMillis();

			System.out.println("Temps écoulé en millisecondes :" + (fin1 - debut1));
			System.out.println("Temps écoulé en millisecondes :" + (fin2 - debut2));
		}

	}

}
