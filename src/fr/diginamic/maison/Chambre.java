package fr.diginamic.maison;

public class Chambre extends Piece {

	
	public Chambre(double superficie, int numeroetage) {
		super(superficie, numeroetage);
		
	}

	@Override
	public String getType() {
		
		return TYPE_CHAMBRE;
	}

	
}
