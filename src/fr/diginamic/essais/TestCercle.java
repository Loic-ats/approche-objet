package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

public class TestCercle {


	public static void main(String[] args) {

		Cercle cercle1 = new Cercle (2);
		Cercle cercle2 = new Cercle (4);

		double perimetre1;
		double perimetre2;
		double surface1;
		double surface2;
		
		
		perimetre1= cercle1.perimetre();
		perimetre2= cercle2.perimetre();
		
		surface1=cercle1.surface();
		surface2=cercle2.surface();
		
				
		System.out.println(perimetre1);
		System.out.println(perimetre2);
		System.out.println(surface1);
		System.out.println(surface2);
		
		
	}

}
