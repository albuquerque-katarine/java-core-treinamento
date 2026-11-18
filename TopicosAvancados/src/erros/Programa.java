package erros;

public class Programa {

	public static void main(String[] args) {
		
		
		String nome = new String(" Ana"); 
		
		// Comparação incorreta de Strings:
		System.out.println( nome == "Ana");		
		
		// Forma correta
		System.out.println( nome.equals("Ana"));
		
		
		// Divisão inteira
		int resultado1 = 5 / 2; 
		System.out.println(resultado1);
		
		// Correção
		double resultado2 = 5.0 / 2; 
		System.out.println(resultado2);
		
	}

}
