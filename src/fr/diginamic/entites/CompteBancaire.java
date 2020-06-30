package fr.diginamic.entites;


public class CompteBancaire {

	private String numerodecompte;
	private double solde;
    private Personne personne;
	
			
	public CompteBancaire(String numerodecompte, double solde,Personne personne) {
		
		this.numerodecompte = numerodecompte;
		this.solde = solde;
		this.personne = personne;
		
	}
	
	// M�thode qui permet de cr�diter le compte
	
		public double creditmontant(double credit) {
			
			return (solde+credit); 
		}
		
		// M�thode qui permet de d�biter le compte
		
		public double debitmontant(double debit) {
			
			return (solde-debit); 
		}
	
	@Override
		public String toString() {
			return "CompteBancaire [numerodecompte=" + numerodecompte + ", solde=" + solde + " "+ personne
					+ "]";
		}

	public String getNumerodecompte() {
		return numerodecompte;
	}
	
	public void setNumerodecompte(String numerodecompte) {
		this.numerodecompte = numerodecompte;
	}
	
	public double getSolde() {
		return solde;
	}
	
	public void setSolde(double solde) {
		this.solde = solde;
	}

	
	
}
