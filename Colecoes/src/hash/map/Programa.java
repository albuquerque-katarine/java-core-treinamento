package hash.map;

import java.util.HashMap;

public class Programa {

	public static void main(String[] args) {
		
		HashMap<String, Integer> idade = new HashMap<>();
		
		idade.put("Ana", 25);
		idade.put("Pedro", 30);

		System.out.println(idade.get("Pedro"));
	}

}
