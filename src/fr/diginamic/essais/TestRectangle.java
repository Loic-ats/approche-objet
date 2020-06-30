package fr.diginamic.essais;

import fr.diginamic.entites.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle (2,3);
		Rectangle rectangle2 = new Rectangle (4,6);

		double perimetre1;
		double perimetre2;
		double surface1;
		double surface2;
		
		
		perimetre1= rectangle1.perimetre();
		perimetre2= rectangle2.perimetre();
		
		surface1=rectangle1.surface();
		surface2=rectangle2.surface();
		
				
		System.out.println(perimetre1);
		System.out.println(perimetre2);
		System.out.println(surface1);
		System.out.println(surface2);
		
		
	}

}
