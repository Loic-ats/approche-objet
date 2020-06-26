package utils;

public class ConversionNombre {

	public static void main(String[] args) {
	
		int a = 3;
		int b= 30;
		
		// Transforme une chaine de caractère en type int 
		
		String variable = "10";
		Integer resultat = Integer.valueOf(variable);
		
			
		System.out.println("Le résultat est :" + resultat);
		
				
		System.out.println("Le résultat max est:" + Integer.max(a, b));
				
	}

}
