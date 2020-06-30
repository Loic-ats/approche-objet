package fr.diginamic.essais;

import fr.diginamic.entites.CompteBancaire;
import fr.diginamic.entites.Personne;


public class TestCompteBancaire {

	public static void main(String[] args) {
		
		Personne Perso1 = new Personne ("Bob","Eponge");
		
		
		CompteBancaire Compte1= new CompteBancaire ("123456789",15000,Perso1);
		
					
		double Solde1 = Compte1.creditmontant(1000);
		
		Compte1.debitmontant(2000);
		
		System.out.println(Solde1);
		System.out.println(Compte1.toString());
		
	}
}

