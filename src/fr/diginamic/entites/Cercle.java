package fr.diginamic.entites;

public class Cercle {

	
		
		private double rayon;

		public Cercle(double rayon) {
			this.rayon = rayon;
		}
		
		// Méthode qui renvoie le périmètre
		
		public double perimetre() {
			
			return rayon*2*Math.PI; 
		}
		
		// Méthode qui renvoie la surface
		
		public double surface() {
			
			return rayon* rayon * Math.PI; 
		}
		
		

		public double getRayon() {
			return rayon;
		}

		public void setRayon(double rayon) {
			this.rayon = rayon;
		}
	
	}


