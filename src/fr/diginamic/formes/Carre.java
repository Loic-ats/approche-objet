package fr.diginamic.formes;
import fr.diginamic.formes.Rectangle;

public class Carre extends Rectangle {

	private double longueur;

	public Carre(double longueur) {
		super(longueur, longueur);
		}
	

	public double calculerSurface() {
		double surface = longueur *longueur;
		return surface;
	}
	
	public double calculerPerimetre() {
		double perimetre = longueur*4;
		return perimetre;
	}
	
	public String afficherType() {
		
		return "Carre";
	}
	
	// Generation des getter et des setter
	public double getLongueur() {
		return longueur;
	}
	
	
}
