package arraylist;

import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);

		System.out.println(numeros.get(1)); // 20

	}

}
