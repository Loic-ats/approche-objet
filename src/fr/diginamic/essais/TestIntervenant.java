package fr.diginamic.essais;

import fr.diginamic.salaire.Salarie;
import fr.diginamic.salaire.Pigiste;

public class TestIntervenant {

	public static void main(String[] args) {
		
		Salarie S1 = new Salarie ("BOB","Eponge","CDI",1500.00);
		Pigiste P1 = new Pigiste ("Jean","Paul", "CDD", 12,100);

		System.out.println(S1.getSalaire());
		System.out.println(P1.getSalaire());
		
		
	}

}
