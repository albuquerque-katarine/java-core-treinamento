package encapsulamento;

class Conta {
	private double saldo;
	
	public void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
		}
	}

	public double getSaldo() {
		return saldo;
	}	
}

public class Programa {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.depositar(50);
		System.out.println(conta.getSaldo());

	}

}
