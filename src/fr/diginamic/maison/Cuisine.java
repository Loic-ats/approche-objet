package fr.diginamic.maison;

public class Cuisine extends Piece {

	
	public Cuisine(double superficie, int numeroetage) {
		super(superficie, numeroetage);
		
	}

	@Override
	public String getType() {
		
		return TYPE_CUISINE;
	}

	
}
