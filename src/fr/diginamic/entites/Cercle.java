package fr.diginamic.entites;

public class Cercle {

	
		
		private double rayon;

		public Cercle(double rayon) {
			this.rayon = rayon;
		}
		
		// M�thode qui renvoie le p�rim�tre
		
		public double perimetre() {
			
			return rayon*rayon; 
		}
		
		// M�thode qui renvoie la surface
		
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


