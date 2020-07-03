package maps;

public class Mapemploye {

	
	private String Nom;
	private int Salaire;
	
		
	public Mapemploye(String nom, int salaire) {
		super();
		Nom = nom;
		Salaire = salaire;
	}
	
	// Getter et setter
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public double getSalaire() {
		return Salaire;
	}
	public void setSalaire(int salaire) {
		Salaire = salaire;
	}
	
	
	
	

}
