package map;

import java.util.HashMap;
import java.util.Map;

public class Programa {

	public static void main(String[] args) {
		
		Map<Integer, String> pessoas = new HashMap<>();
		
		pessoas.put(1, "Ana");
		pessoas.put(2, "Pedro");
		
		System.out.println(pessoas.get(2));
	}

}
