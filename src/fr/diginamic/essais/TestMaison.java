package fr.diginamic.essais;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.WC;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;

public class TestMaison {


	public static void main(String[] args) {
	
		
		Maison maison = new Maison();
		Cuisine cuisine = new Cuisine(15, 0);
		Salon salon = new Salon(40, 0);
		Chambre chambre1 = new Chambre (12,1);
		Chambre chambre2 = new Chambre (12,1);
		WC wc= new WC(3,0);
		SalleDeBain salledebaim = new SalleDeBain (8,1);
		
		
		maison.ajouterPiece(cuisine);
		maison.ajouterPiece(salon);
		maison.ajouterPiece(chambre1);
		maison.ajouterPiece(chambre2);
		maison.ajouterPiece(wc);
		maison.ajouterPiece(salledebaim);
		maison.afficherTab();
		System.out.println(maison.superficietotale());
		
		System.out.println(maison.superficieparetage(1));
		
		System.out.println(maison.superficieparetypedepiece(Piece.TYPE_CUISINE));
		System.out.println(maison.superficieparetypedepiece(Piece.TYPE_CHAMBRE));
		
	}

}
