package personalizada;

class SaldoInsuficienteException extends Exception {
	private static final long serialVersionUID = 1L;

	SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	}	
}

public class Programa {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		int idade = 15;

		if (idade < 18) {
			throw new SaldoInsuficienteException("Idade inválida");
		}
		
		System.out.println(idade);

	}

}
