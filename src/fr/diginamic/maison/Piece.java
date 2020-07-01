package fr.diginamic.maison;

public abstract class Piece {

	private double superficie;
	private int numeroetage;
	
		
	public Piece(double superficie, int numeroetage) {
		super();
		this.superficie = superficie;
		this.numeroetage = numeroetage;
	}
	
	public abstract  String getType();
	
	public static final String TYPE_CHAMBRE = "Chambre";
	public static final String TYPE_CUISINE = "Cuisine";
	public static final String TYPE_SALON = "Salon";
	public static final String TYPE_SALLEDEBAIM = "SalleDeBain";
	public static final String TYPE_WC = "WC";
	
	// Generation des getter et des setters
	
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	public int getNumeroetage() {
		return numeroetage;
	}
	public void setNumeroetage(int numeroetage) {
		this.numeroetage = numeroetage;
	}

	@Override
	public String toString() {
		return "Piece [superficie=" + superficie + ", numeroetage=" + numeroetage + "]";
	}
		
}
