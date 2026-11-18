package gettersetter;

class Pessoa {
	String nome;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
}

public class Programa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Maria");
		
		System.out.println(pessoa.getNome());

	}

}
