package fr.diginamic.recensement;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;


public class Application {

	// Méthode permetttant de recherche les informations sur une ville donnée
	public static Ville rechercheVille(ArrayList<Ville> list, String nomCommune) {

		Ville ref = null;
		for (Ville ville : list) {
			if (ville.getNomCommune().equals(nomCommune)) {
				ref = ville;
			}
		}
		return ref;
	}

	// Méthode permettant la conversion du string en int (variable population)
	public static int conversionPopulation(ArrayList<Ville> list, String population) {

		int populationTotale = Integer.parseInt(population.replace(" ", "").trim());

		return populationTotale;
	}

	// Méthode permettant de retrouver la population total d'un département
	public static int populationDepartement(ArrayList<Ville> list, String codeDepartement) {

		int populationdepartement = 0;

		for (Ville ville : list) {
			if (ville.getCodeDepartement().equals(codeDepartement)) {

				populationdepartement = populationdepartement + conversionPopulation(list, ville.getPopulation());

			}
		}
		return populationdepartement;
	}

	// Méthode pour afficher la pluspetite ville d'un département

	public static Ville plusPetiteVille(ArrayList<Ville> list, String codeDepartement) {

		Ville villelamoinspeuplee = list.get(1);

		for (Ville ville : list) {

			if (ville.getCodeDepartement().equals(codeDepartement) && conversionPopulation(list,
					ville.getPopulation()) < conversionPopulation(list, villelamoinspeuplee.getPopulation())) {

				villelamoinspeuplee = ville;
			}
		}
		return villelamoinspeuplee;
	}

	// Méthode permettant de compter les dix plus grandes ville d'un département

	public static ArrayList<Ville> dixplusgrandeville(ArrayList<Ville> list, String codeDepartement) {

		ArrayList<Ville> dixMaxVilles = new ArrayList<>();
		int compteur = 0;

		// initialisation du compteur

		while (compteur < 10) {
			Ville villelapluspeuplee = list.get(1);

			// recherche de 10 fois la ville avec la plus grande pop°

			for (Ville ville : list) {
				if (ville.getCodeDepartement().equals(codeDepartement)
						&& conversionPopulation(list, ville.getPopulation()) > conversionPopulation(list,
								villelapluspeuplee.getPopulation())
						&& rechercheVille(dixMaxVilles, ville.getNomCommune()) == null) {

					// permet de voir si la ville est dans le dpt, si la pop° est plus grande que

					// celle enregistré, et si on l'a deja ou pas.

					// le null permet de ne pas rester 10 fois sur la meme ville (montpellier pour
					// l'herault)

					villelapluspeuplee = ville;
				}
			}
			dixMaxVilles.add(villelapluspeuplee);
			compteur++;
		}
		return dixMaxVilles;
	}

	// Méthode permettant de compter les dix plus petite ville d'un département

	public static ArrayList<Ville> dixpluspetiteville(ArrayList<Ville> list, String codeDepartement) {

		ArrayList<Ville> dixMinVilles = new ArrayList<>();
		int compteur = 0;

		// initialisation du compteur

		while (compteur < 10) {
			Ville villelamoinspeuplee = list.get(1);

			// recherche de 10 fois la ville avec la plus grande population

			for (Ville ville : list) {
				if (ville.getCodeDepartement().equals(codeDepartement)
						&& conversionPopulation(list, ville.getPopulation()) < conversionPopulation(list,
								villelamoinspeuplee.getPopulation())
						&& rechercheVille(dixMinVilles, ville.getNomCommune()) == null) {

					// permet de voir si la ville est dans le dpt, si la pop° est plus petite que

					// celle enregistré, et si on l'a deja ou pas.

					// le null permet de ne pas rester 10 fois sur la meme ville (montpellier pour
					// l'herault)

					villelamoinspeuplee = ville;
				}
			}
			dixMinVilles.add(villelamoinspeuplee);
			compteur++;
		}
		return dixMinVilles;
	}

	// Méthode permettant de compter les dix plus grandes ville d'une région

	public static ArrayList<Ville> dixplusgrandevilleregion(ArrayList<Ville> list, String codeRegion) {

		ArrayList<Ville> dixMaxVilles = new ArrayList<>();
		int compteur = 0;

		// initialisation du compteur

		while (compteur < 10) {
			Ville villelapluspeuplee = list.get(1);

			// recherche de 10 fois la ville avec la plus grande pop°

			for (Ville ville : list) {
				if (ville.getCodeRegion().equals(codeRegion)
						&& conversionPopulation(list, ville.getPopulation()) > conversionPopulation(list,
								villelapluspeuplee.getPopulation())
						&& rechercheVille(dixMaxVilles, ville.getNomCommune()) == null) {

					// permet de voir si la ville est dans le dpt, si la pop° est plus grande que

					// celle enregistré, et si on l'a deja ou pas.

					// le null permet de ne pas rester 10 fois sur la meme ville (montpellier pour
					// l'herault)

					villelapluspeuplee = ville;
				}
			}
			dixMaxVilles.add(villelapluspeuplee);
			compteur++;
		}
		return dixMaxVilles;
	}

	// Méthode pour afficher la population totale d'une région

	public static int populationRegion(ArrayList<Ville> list, String codeRegion) {

		int populationregion = 0;

		for (Ville ville : list) {
			if (ville.getCodeRegion().equals(codeRegion)) {

				populationregion = populationregion + conversionPopulation(list, ville.getPopulation());

			}
		}
		return populationregion;
	}

	// Méthode permettant de compter le département le plus peuplé d'une région

	public static String departementlepluspeuple(ArrayList<Ville >list , String codeRegion) {

		ArrayList<String>departement = new ArrayList<>();
		ArrayList<String>departementsansdoublon = new ArrayList<>();
		String departementmax = null;
		Set set = new HashSet();
		
		//Affiche l'ensemble des département d'une régions avec des doublons
		for (Ville ville : list) {
			if (ville.getCodeRegion().equals(codeRegion)) {
				departement.add(ville.getCodeDepartement());
			}
			
		//Suppresion des doublons pour garder uniquement une fois le nom du département
			
				set.addAll(departement);
				departementsansdoublon = new ArrayList(set) ;
		}
		
		//Comparaison de la population de chaque département afin de trouver le plus peuplé
		
		for (int i = 0; i < departementsansdoublon.size(); i ++ ) {
			
			if (populationDepartement(list, departementsansdoublon.get(1)) < populationDepartement(list, departementsansdoublon.get(i))) {
				
				departementmax = departementsansdoublon.get(i);
			}
		}
		
		return departementmax;
	}


	public static void main(String[] args) {

		try {

			File file = new File(
					"D:\\DONNEES ISA\\Documents\\Diginamic\\Cours\\Java Approche objet\\TP\\Tp Guide resencement population\\recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");

			ArrayList<Ville> list = new ArrayList<>();

			for (String ligne : lignes) {

				String[] morceaux = ligne.split(";");
				String codeRegion = morceaux[0];
				String nomRegion = morceaux[1];
				String codeDepartement = morceaux[2];
				String codeCommune = morceaux[5];
				String nomCommune = morceaux[6];
				String population = morceaux[7];

				Ville v = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, population);

				list.add(v);

			}

			rechercheVille(list, "Montpellier");
			System.out.println(rechercheVille(list, "Montpellier").toString());
			System.out.println("--------------------------------------------");
			System.out.println("Nombre de lignes :" + lignes.size());
			System.out.println("--------------------------------------------");
			System.out.println(populationDepartement(list, "34"));
			System.out.println("---------------------------------------------");
			System.out.println(plusPetiteVille(list, "34"));
			System.out.println("----------------------------------------------");
			System.out.println(dixplusgrandeville(list, "34"));
			System.out.println("----------------------------------------------");
			System.out.println(dixpluspetiteville(list, "34"));
			System.out.println("----------------------------------------------");
			System.out.println(populationRegion(list, "76"));
			System.out.println("----------------------------------------------");
			System.out.println(dixplusgrandevilleregion(list, "76"));
			System.out.println("----------------------------------------------");
			System.out.println(departementlepluspeuple(list, "76"));

			// Trier la liste par ordre croissant en fonction du nombre de population

		} catch (IOException e) {

			System.out.println(e.getMessage());
		}

	}
}
