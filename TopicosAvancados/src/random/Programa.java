package random;

import java.util.Random;

public class Programa {

	public static void main(String[] args) {
		
		Random random = new Random(); 
		
		int numero = random.nextInt(10) + 1; 
		
		System.out.println(numero);
	}

}
