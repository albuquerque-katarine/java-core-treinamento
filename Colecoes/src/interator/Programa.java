package interator;

import java.util.ArrayList;
import java.util.Iterator;

public class Programa {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Ana"); 
		nomes.add("Carlos");
		
		Iterator<String> it = nomes.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
