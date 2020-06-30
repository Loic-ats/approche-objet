package fr.diginamic.entites;

public class Rectangle {

	
	private double longueur;
	private double largeur;
	
	
	public Rectangle(double longueur, double largeur) {
		
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	// Méthode qui renvoie le périmètre
	
	public double perimetre() {
		
		return (longueur+largeur) * 2; 
	}
	
	// Méthode qui renvoie la surface
	
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
