package fr.diginamic.formes;

public class Rectangle extends Forme {

	
	private double longueur;
	private double largeur;
	
		
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public double calculerSurface() {
			double surface = largeur* longueur;	
		return surface;
	}
	
	public double calculerPerimetre() {
		double perimetre = (largeur+longueur)*2;
		return perimetre;
	}

	public String afficherType() {
		
		return "Rectangle";
	}
	
	// Generation des getter et des setter
	
	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	

}
