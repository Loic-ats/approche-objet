package fr.diginamic.operations;

import fr.diginamic.entites.Cercle;

public class Operations {

	public static double calcul (double a, double b, char op) {
		
		if (op == '+' ) {
			
			return a+b;
			
		} else if (op =='-') {
			
			return a-b;
			
		} else if (op =='*') {
			
			return a*b;
			
		} else {
		
			return a/b;
					
		}
	
}
}
