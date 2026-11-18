package converter;

public class Programa {

	public static void main(String[] args) {
		
		// Conversão implícita:
		int numero1 = 10; 
		double resultado1 = numero1; 
		System.out.println(resultado1);
		
		// Conversão explícita:
		double numero2 = 10.75; 
		int resultado2 = (int) numero2; 
		System.out.println(resultado2);
	}

}
