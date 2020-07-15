package anonyme;

public class TestClasseAnonyme  {



	public static void main(String[] args) {
		
		Operation op = (a,b) -> a+b ; 
		
		
		// Ecriture lambda aorés simplification de la classe anonyme (interface Predicat)
		
		Predicat p = (d) -> d> 10 ; 


		System.out.println(op.exec(8, 5));
		System.out.println(p.test(5));

	}

}


