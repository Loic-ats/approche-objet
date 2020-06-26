package fr.diginamic.banque.entites;

public class TestOperation {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Operation[] taboperation= new Operation [4];
		taboperation[0] = new Credit("15/02/2015", 100);
		taboperation[1] = new Debit ("15/03/2014",150);
		taboperation[2] = new Credit ("11/03/2013",200);
		taboperation[3] = new Debit ("14/03/2012",150);
		
			int solde= 0;
		
		for (int i =0 ; i<= taboperation.length - 1; i++) {
			
			System.out.println(taboperation[i]);
			
			if (taboperation[i].getType().equals("CREDIT")) {
				solde += Operation[i].getMontant();
			}
				Else {
						
				solde -= taboperation[i].getMontant();
			}
		
	}
	}
}
	
