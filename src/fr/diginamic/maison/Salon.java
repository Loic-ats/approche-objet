package fr.diginamic.maison;

public class Salon extends Piece {

	
	public Salon(double superficie, int numeroetage) {
		super(superficie, numeroetage);
		
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return TYPE_SALON;
	}

}
