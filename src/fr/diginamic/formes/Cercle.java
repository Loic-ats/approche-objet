package fr.diginamic.formes;

public class Cercle extends Forme {
	
	private double rayon;

		
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	public double calculerSurface() {
		double surface = rayon* rayon * Math.PI;	
		return surface;
	}

	
	public double calculerPerimetre() {
		double perimetre = rayon* 2 *Math.PI;
		return perimetre;
	}
		
	public String afficherType() {
		
		return "Cercle";
	}
	
	//Generation des getter et des setter

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	
	
	

}
