package sets;
import java.util.Collections;
import java.util.HashSet;

public class TestSetDouble {


	public static void main(String[] args) {
		
		HashSet<Double> set = new HashSet <Double>();
		
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
	    set.add(0.01);
	    
	    //Afficher les éléments du HashSet
		
	    System.out.println(set);
	    
	    // Affciher la plus grande valeur du HashSet
	    
	    Object top = Collections.max(set);
		System.out.println(top);
		
		//Supprimer le plus petit element de la collection
		
		Object small = Collections.min(set);
		set.remove(small);
		System.out.println(set);	
		
	}

}
