package interfaces;
public class TestObjetGeometrique {

	public TestObjetGeometrique() {
	}

	public static void main(String[] args) {
		
		ObjetGeometrique[] tab = new ObjetGeometrique [2];
		
		//Cercle cercle1 = new Cercle (2);
		//Rectangle rectangle1 = new Rectangle(2,3);
		
		tab[0] = new Cercle (2);
		tab[1]= new Rectangle(2,3);
		
		for(int i =0; i<=tab.length-1;i++) {
			
			
			System.out.println(tab[i]);
			
			System.out.println("Le perimetre du " + tab[i].getType() + " est de" + tab[i].perimetre());
			System.out.println("La surface du " + tab[i].getType() + " est de " + tab[i].surface());
		}
		
	}

}
