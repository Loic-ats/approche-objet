package fr.diginamic.banque.entites;

public class Compte {

			
		private int numerodecompte ;
		private int soldeducompte;
		
		public Compte(int numerodecompte,  int soldeducompte) {
			
			this.numerodecompte= numerodecompte;
			this.soldeducompte = soldeducompte;
			
		}

		public int getNumerodecompte() {
			return numerodecompte;
		}

		public void setNumerodecompte(int numerodecompte) {
			this.numerodecompte = numerodecompte;
		}

		public int getSoldeducompte() {
			return soldeducompte;
		}

		public void setSoldeducompte(int soldeducompte) {
			this.soldeducompte = soldeducompte;
		}

		@Override
		public String toString() {
			return "Compte [numerodecompte = " + numerodecompte + ", soldeducompte = " + soldeducompte + "]";
		}

		
	}


