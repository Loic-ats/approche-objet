package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {

	public TestDates() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		//Utilisation de deux méthode pour afficher ma date du jours
		//Methode 1 on utilise l'objet date
		
		Date date1 = new Date();
	
		// On utilise SimpleDateFormat pour afficher parametre l'affichage de la date en utilisant les patterns (voir tableaux)
		SimpleDateFormat formateur =new SimpleDateFormat( "dd/MM/yyyy");
		String chaine  = formateur.format(date1);
				
		// On créer une instance de la classe Date à la date du 19 mai 2016 à 23h59 et 30 secondes
		
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2016, 4, 19, 23, 59, 30);
		Date date2 = cal1.getTime();
		
		//Afficher Affichez l’instance ainsi créée au format suivant (année/mois/jour heure:minute:seconde) :
		
		SimpleDateFormat formateur2 =new SimpleDateFormat( "dd/MM/yyyy HH:mm:ss");
		String chaine2  = formateur2.format(date2);
		
		//On créer une instance de la classe date et on l'affiche au meme format que précédement

		Date date3 = new Date();
		SimpleDateFormat formateur3 =new SimpleDateFormat( "dd/MM/yyyy HH:mm:ss");
		String chaine3  = formateur3.format(date3);
		
		
		//Affichage des differentes dates générée

		System.out.println(date1);
		System.out.println("----------------------------------");
		System.out.println(chaine);
		System.out.println("----------------------------------");
		System.out.println(date2);
		System.out.println("----------------------------------");
		System.out.println(chaine2);
		System.out.println("----------------------------------");
		System.out.println(chaine3);
	}

}
