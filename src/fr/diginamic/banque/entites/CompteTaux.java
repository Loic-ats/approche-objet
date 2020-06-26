package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	private float tauxderemuneration = 0.75f;
	
	public CompteTaux (float tauxderemuneration, int numerodecompte, int soldeducompte) {
		super (numerodecompte, soldeducompte);
		
		this.tauxderemuneration = tauxderemuneration;
	}
		
	
	public float getTaux() {
		return tauxderemuneration;
	}

	public void setTaux(float taux) {
		this.tauxderemuneration = taux;
	}
	
	@Override
	public String toString() {
		   String newToString = super.toString() + " taux de rémunération = " + tauxderemuneration;
		
		return newToString;
	}
	
}
