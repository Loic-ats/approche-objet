package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte Compte1 = new Compte(52525552, 152000);
		Compte Compte2= new Compte(85522414,15487);
				
		CompteTaux Taux1 = new CompteTaux(0.75f,789524122, 100);
		CompteTaux Taux2 = new CompteTaux (0.90f,85522414,150);
		
		//Dans la méthode println, il invoque la méthode toString donc on est pas obligé de la rappeler dans le println
		
		
		Compte[] tabCompte = new Compte[2];
		
		tabCompte [0] =  new Compte(52525552, 152000);
		tabCompte [1] = new CompteTaux (0.90f,85522414,150);
		
		for (int i =0 ; i<= tabCompte.length - 1; i++) {
			
			System.out.println(tabCompte[i]);
		}
		
					
		System.out.println(Compte1);
				
		System.out.println(Taux1);
				
	}

	
}
