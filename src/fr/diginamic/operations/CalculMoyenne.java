package fr.diginamic.operations;

import java.util.Scanner;

public class CalculMoyenne {

	Scanner scan = new Scanner(System.in);
	double val;
	double somme = 0;
	double moyenne;

	double[] tab = new double[5];

	public CalculMoyenne() {

	}

	public void ajout() {

		for (int i = 0; i < 10; i++) {
			
			System.out.println("Saisissez une valeur");
			val = scan.nextInt();
			
			if (i < tab.length) {
				tab[i] = val;
			} else if (i == tab.length) {

				double[] newtab = new double[tab.length + 1];
				for (int n = 0; n < newtab.length; n++) {
					if (n < tab.length) {
						newtab[n] = tab[n];

					} else {
						newtab[n] = val;

					}

				}

				tab = newtab;

			}

		}

	}
	
	public double calcul () {
		for (int n= 0; n <tab.length; n++) {
		somme = somme + tab[n];
	}
	
		moyenne = somme / tab.length;
		return moyenne; 
}
	
}
