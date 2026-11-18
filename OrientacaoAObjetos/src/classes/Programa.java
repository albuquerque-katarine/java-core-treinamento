package classes;

class Pessoa {
	String nome;
}

public class Programa {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.nome = "Maria";
		
		System.out.println(pessoa.nome);
	}

}
