package utils;

public class ConversionNombre {

	public static void main(String[] args) {
	
		int a = 3;
		int b= 30;
		
		// Transforme une chaine de caract�re en type int 
		
		String variable = "10";
		Integer resultat = Integer.valueOf(variable);
		
			
		System.out.println("Le r�sultat est :" + resultat);
		
				
		System.out.println("Le r�sultat max est:" + Integer.max(a, b));
				
	}

}
