package fr.diginamic.essais;
import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		
		double addition = Operations.calcul (5,4,'+');
		double soustraction = Operations.calcul (5,4,'-');
		double multiplication = Operations.calcul (5,4,'*');
		double division = Operations.calcul (8,4,'/');
		

		System.out.println(addition);
		System.out.println(soustraction);
		System.out.println(multiplication);
		System.out.println(division);
		
	}

}
