package construtores;

class Pessoa {
	String nome;
	
	Pessoa(String nome) {
		this.nome = nome;
	}
}

public class Programa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Pedro");
		
		System.out.println(pessoa.nome);
	}

}
