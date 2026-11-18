package formatacao;

public class Programa {

	public static void main(String[] args) {
		
		String nome = "Ana";
		int idade = 25;
		
		String resultado = String.format("Nome: %s | Idade: %d%n", nome, idade);
		
		System.out.println(resultado);
	}

}
