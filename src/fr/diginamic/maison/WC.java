package fr.diginamic.maison;

public class WC extends Piece {

	
	public WC(double superficie, int numeroetage) {
		super(superficie, numeroetage);
		
	}

	@Override
	public String getType() {
		
		return TYPE_WC;
	}

}
