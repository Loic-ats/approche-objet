package maps;

import java.util.HashMap;

public class CreationMap {

	public CreationMap() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		Mapemploye user1 = new Mapemploye("Paul", 1750);
		Mapemploye user2 = new Mapemploye("Hicham", 1825);
		Mapemploye user3 = new Mapemploye("Yu", 2250);
		Mapemploye user4 = new Mapemploye("Ingrid", 2015);
		Mapemploye user5 = new Mapemploye("Chantal", 2418);
		
		
		HashMap <String, Mapemploye> map = new HashMap <>();
		
		map.put("Paul", user1);
		map.put("Hicham", user2);
		map.put("Yu", user3);
		map.put("Ingrid", user4);
		map.put("Chantal", user5);
		
		System.out.println(map.size());

	}

}
