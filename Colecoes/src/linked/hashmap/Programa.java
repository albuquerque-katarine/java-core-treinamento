package linked.hashmap;

import java.util.LinkedHashMap;

public class Programa {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> dados = new LinkedHashMap<>();
		dados.put(2, "Maria");
		dados.put(1, "Ana"); 
		System.out.println(dados);

	}

}
