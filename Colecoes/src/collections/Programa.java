package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Programa {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>(); 
		numeros.add(30); 
		numeros.add(10); 
		numeros.add(20); 
		
		Collections.sort(numeros); 
		
		System.out.println(numeros);
	}

}
