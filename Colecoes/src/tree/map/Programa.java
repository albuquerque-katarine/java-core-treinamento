package tree.map;

import java.util.TreeMap;

public class Programa {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> pessoas = new TreeMap<>();
		
		pessoas.put(3, "Carlos");
		pessoas.put(1, "Ana");
		pessoas.put(2,"Maria");
		
		System.out.println(pessoas);

	}

}
