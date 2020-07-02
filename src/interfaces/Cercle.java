package interfaces;

public class Cercle implements ObjetGeometrique {



	private double rayon;
	
	//Constructeur
	public Cercle(double rayon) {
		 this.rayon= rayon;
	}

// Méthode a redéfinir de l'interface ObjetGeométrique
	
	@Override
	public double perimetre() {
		
		return rayon* 2 *Math.PI;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return rayon* rayon * Math.PI;
	}
	
	
	@Override
	public String getType() {
			return "CERCLE";
	}
	
	
	//Generation des getters et des setters


	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}



}
