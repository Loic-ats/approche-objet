package interfaces;
public class Rectangle implements ObjetGeometrique{



	private double longueur;
	private double largeur;
	
	
	// Constructeur
	public Rectangle(double longueur, double largeur) {
		
		this.longueur = longueur;
		this.largeur = largeur;
			
	}
	
	// M�thode a red�finir de l'interface ObjetGeom�trique
	
	@Override
	public double perimetre() {
	
		return (longueur + largeur) * 2 ;
	}

	@Override
	public double surface() {
		
		return longueur * largeur;
	}
	
	@Override
	public String getType() {
		return "RECTANGLE";
	}
	
	
	
	// G�n�ration des getters et des setters

	

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
