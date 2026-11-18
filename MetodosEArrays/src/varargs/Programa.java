package varargs;

public class Programa {
	
	static int somar( int... numeros) {
		int total = 0;
		
		for (int numero : numeros) {
			total += numero;
		}		
		return total;
	}

	public static void main(String[] args) {
		
		System.out.println(somar(10, 20, 30));

	}

}
