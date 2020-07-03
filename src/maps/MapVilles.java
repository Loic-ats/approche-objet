package maps;

import java.util.HashMap;

public class MapVilles {


	public static void main(String[] args) {
	
		HashMap<Integer, String> mapVilles =new HashMap<>();
		
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put (59,"Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33,"Gironde");
		
		// On déclare une variable "key", cette variable va prendre succesisvement la valeurs à droite des ":"
		//On affiche au fur et à mesure les valeurs de key et donc les numerot de département
		
		for (int key : mapVilles.keySet()) {
			System.out.println(key);
		}
		
		
		System.out.println("---------------------------------------------------");
		
		//Affiche l'ensemble des valeurs de la Hashmap
		for (String key : mapVilles.values()) {
		System.out.println(key);
		
	}
		System.out.println("---------------------------------------------------");
		//Afficher la taille de la map
		System.out.println(mapVilles.size());
		
		
}
}
