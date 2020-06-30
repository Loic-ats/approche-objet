package fr.diginamic.entites;

public class Cercle {

	
		
		private double rayon;

		public Cercle(double rayon) {
			this.rayon = rayon;
		}
		
		// Méthode qui renvoie le périmètre
		
		public double perimetre() {
			
			return rayon*rayon; 
		}
		
		// Méthode qui renvoie la surface
		
		public double surface() {
			
			return rayon* rayon *3.14; 
		}
		
		

		public double getRayon() {
			return rayon;
		}

		public void setRayon(double rayon) {
			this.rayon = rayon;
		}
	
	}


