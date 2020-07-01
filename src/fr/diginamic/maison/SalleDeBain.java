package fr.diginamic.maison;

public class SalleDeBain extends Piece {

	
	public SalleDeBain(double superficie, int numeroetage) {
		super(superficie, numeroetage);
		
	}

	@Override
	public String getType() {
		
		return TYPE_SALLEDEBAIM;
	}

}
