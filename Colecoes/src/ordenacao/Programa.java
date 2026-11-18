package ordenacao;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>(); 
		nomes.add("Carlos"); 
		nomes.add("Ana"); 
		nomes.add("Bruno"); 
		
		nomes.sort(null); 
		
		System.out.println(nomes);
	}

}
