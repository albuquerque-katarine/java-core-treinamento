package recursividade;

public class Programa {

	static int contar(int numero) {
		if(numero == 0) {
			return 0;
		}
		
		return numero + contar(numero -1);
	}
	
	public static void main(String[] args) {
		
		System.out.println(contar(3));

	}

}
