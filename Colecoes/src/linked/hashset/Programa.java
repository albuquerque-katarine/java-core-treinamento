package linked.hashset;

import java.util.LinkedHashSet;

public class Programa {

	public static void main(String[] args) {
		
		LinkedHashSet<String> nomes = new LinkedHashSet<>(); 
		nomes.add("Ana"); 
		nomes.add("Carlos"); 
		nomes.add("Ana"); 
		
		System.out.println( nomes);

	}

}
