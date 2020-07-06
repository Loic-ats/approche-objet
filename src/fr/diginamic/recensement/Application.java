package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.FileUtils;
import fr.diginamic.recensement.Ville;

public class Application {

	// M�thode permetttant de recherche les informations sur une ville donn�e
	public static Ville rechercheVille(ArrayList<Ville> list, String nomCommune) {

		Ville ref = null;
		for (Ville ville : list) {
			if (ville.getNomCommune().equals(nomCommune)) {
				ref = ville;
			}
		}
		return ref;
	}

	// M�thode permettant la conversion du string en int (variable population)
	public static int conversionPopulation(ArrayList<Ville> list, String population) {

		int populationTotale = Integer.parseInt(population.replace(" ", "").trim());

		return populationTotale;
	}

	// M�thode permettant de retrouver la population total d'un d�partement
	public static int populationDepartement(ArrayList<Ville> list, String codeDepartement) {

		int populationdepartement = 0;

		for (Ville ville : list) {
			if (ville.getCodeDepartement().equals(codeDepartement)) {

				populationdepartement = populationdepartement + conversionPopulation(list, ville.getPopulation());

			}
		}
		return populationdepartement;
	}

	// M�thode pour afficher la pluspetite ville d'un d�partement

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

	// M�thode pour afficher les 10 plus grande ville du d�partement (en nb de
	// population)

	public static Ville dixPlusGrandesVilles(ArrayList<Ville> list, String codeDepartement) {

		Ville villelapluspeuplee = list.get(1);

		for (Ville ville : list) {

			if (ville.getCodeDepartement().equals(codeDepartement) && conversionPopulation(list,
					ville.getPopulation()) > conversionPopulation(list, villelapluspeuplee.getPopulation())) {

				villelapluspeuplee = ville;
			}
		}
		return villelapluspeuplee;
	}

	// M�thode pour afficher la population totale d'une r�gion

	public static int populationRegion(ArrayList<Ville> list, String codeRegion) {

		int populationregion = 0;

		for (Ville ville : list) {
			if (ville.getCodeRegion().equals(codeRegion)) {

				populationregion = populationregion + conversionPopulation(list, ville.getPopulation());

			}
		}
		return populationregion;
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

			System.out.println("-----------------------------------------");

			System.out.println(populationDepartement(list, "34"));

			System.out.println("-----------------------------------------");
			System.out.println(plusPetiteVille(list, "34"));
			System.out.println("-----------------------------------------");
			System.out.println(dixPlusGrandesVilles(list, "34"));
			System.out.println("-----------------------------------------");
			System.out.println(populationRegion(list, "76"));

		} catch (IOException e) {

			System.out.println(e.getMessage());
		}

	}
}
