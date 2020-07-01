package fr.diginamic.essais;
import fr.diginamic.formes.Forme;


public class AffichageForme {

	public static String afficher(Forme forme) {
		double perimetre = forme.calculerPerimetre();
		double surface = forme.calculerSurface();
		String result = "Le perimetre de la forme est de " + perimetre + "sa surface est de " + surface ;
		return result;
	}
	
		
}
