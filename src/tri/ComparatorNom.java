package tri;
import java.util.Comparator;

public class ComparatorNom implements Comparator <Ville> {

	public ComparatorNom() {
		// TODO Auto-generated constructor stub
	}
	
	public int compare(Ville Ville1, Ville Ville2) {

		int valeur = Ville1.getNom().compareTo(Ville2.getNom());
		return valeur;
	}

}
