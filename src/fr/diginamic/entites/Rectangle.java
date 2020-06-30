package fr.diginamic.entites;

public class Rectangle {

	
	private double longueur;
	private double largeur;
	
	
	public Rectangle(double longueur, double largeur) {
		
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	// M�thode qui renvoie le p�rim�tre
	
	public double perimetre() {
		
		return (longueur+largeur) * 2; 
	}
	
	// M�thode qui renvoie la surface
	
	public double surface() {
		
		return longueur*largeur; 
	}
	
	
	
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
