package hash.set;

import java.util.HashSet;

public class Programa {

	public static void main(String[] args) {
		
		HashSet<Integer> numeros = new HashSet<>(); 
		numeros.add(10); 
		numeros.add(20); 
		numeros.add(10); 
		System.out.println(numeros.size());

	}

}
