package entites;

public class AdressePostale {
	

	public int numeroRue;
	public String libelleRue;
	public int codePostal;
	public String ville;
	
	public AdressePostale(int nvnumeroRue, String nvlibelleRue, int nvcodePostal, String nvville) {
		
		numeroRue= nvnumeroRue;
		libelleRue = nvlibelleRue;
		codePostal = nvcodePostal;
		ville = nvville;
		
	}

	@Override
	public String toString() {
		return "AdressePostale [numeroRue=" + numeroRue + ", libelleRue=" + libelleRue + ", codePostal=" + codePostal
				+ ", ville=" + ville + "]";
	}

}