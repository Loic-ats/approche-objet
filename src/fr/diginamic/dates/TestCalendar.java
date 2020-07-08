package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {

		// cr�er une instance de Date � la date du 19 mai 2016 � 23h59 et 30 secondes et
		// affichez la au format suivant jour/mois/ann�e :

		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);
		;
		Date date = cal.getTime();
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		String chaine = formateur.format(date);

		// cr�er une instance de Date � la date du jours

		Calendar cal1 = Calendar.getInstance();
		Date date1 = cal1.getTime();
		SimpleDateFormat formateurfr = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String chaine1 = formateurfr.format(date1);
		
		// Affichage de la date en RUSSE, ALLEMAND et CHINOIS
		
		Locale russe = new Locale("ru", "RU");
		SimpleDateFormat formateurRusse = new SimpleDateFormat("EEEEE dd/MMMMM/yyyy HH:mm:ss", russe);
		SimpleDateFormat formateurChinois = new SimpleDateFormat("EEEEE dd/MMMMM/yyyy HH:mm:ss", Locale.CHINESE);
		SimpleDateFormat formateurGerman = new SimpleDateFormat(" EEEEE dd/MMMMM/yyyy HH:mm:ss", Locale.GERMAN);

		
		

		System.out.println(chaine);
		System.out.println("---------------------");
		System.out.println(date1);
		System.out.println("---------------------");
		System.out.println(chaine1);
		System.out.println("---------------------");
		System.out.println("La date en Allemand est " + formateurGerman.format(date1));
		System.out.println("---------------------");
		System.out.println("La date en Chinois est " + formateurChinois.format(date1));
		System.out.println("---------------------");
		System.out.println("La date en Russe est " + formateurRusse.format(date1));
	}

}
