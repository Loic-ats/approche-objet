package fr.diginamic.chaines;
import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		
		
		String chaine = "Durand;Marcel;2 523.5";
		
		//Affiche le premiers caractère de la chaine 
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		
		//Longueur totale de la chaine
		System.out.println(chaine.length());

		//Indique la place du premier caractère dans le paramètre soit ';'
		System.out.println(chaine.indexOf(';'));
		
		//Afficher le nom de famille du chaine
		System.out.println(chaine.substring(0, chaine.indexOf(';')));
		
		//Afficher le nom de famille en majuscule
		System.out.println(chaine.substring(0, chaine.indexOf(';')).toUpperCase());
		
		//Afficher le nom de famille en minuscule
		System.out.println(chaine.substring(0, chaine.indexOf(';')).toLowerCase());
		
		//Decouper une chaine de caractère et l'afficher sous forme d'un tableau avec la méthode split
		
        String[] tabstr = chaine.split(";");
        for (String a: tabstr)
            System.out.println(a);
        
        // Comment fonctionne l'affichage ci-dessus???
        
        String[] tabchaine2 = chaine.split(";");
        for (int i=0; i< tabchaine2.length; i++) {
            System.out.println(tabchaine2[i]);
				
	}
        
        //Suppresion de l'espace de façon automatiquement pour 2 523.5
        
        String modif = tabchaine2[2]. replaceAll(" ", "");
        System.out.println(modif);
        
        //Conversion du string en double
        double salaire = Double.parseDouble(modif);
        
        Salarie salarie1 = new Salarie(tabchaine2[0],tabchaine2[1],salaire);


}
}
