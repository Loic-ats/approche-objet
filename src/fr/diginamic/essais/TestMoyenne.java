package fr.diginamic.essais;
import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		CalculMoyenne moyenne1 = new CalculMoyenne (); 
		moyenne1.ajout();

		System.out.println(moyenne1.calcul());		
	}

}
