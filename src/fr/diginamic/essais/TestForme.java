package fr.diginamic.essais;

import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;
import fr.diginamic.formes.Carre;
import fr.diginamic.essais.AffichageForme;

public class TestForme {

	public static void main(String[] args) {
		
		Cercle cercle1 = new Cercle(2);
		Rectangle rectangle1 = new Rectangle(2,2);
		Carre carre1 = new Carre(3);
					
		AffichageForme.afficher(cercle1);
		AffichageForme.afficher(rectangle1);
		AffichageForme.afficher(carre1);
	}

}
