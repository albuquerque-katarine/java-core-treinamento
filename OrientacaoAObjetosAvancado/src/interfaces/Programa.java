package interfaces;

interface Pagamento {
	void pagar();
}

class Pix implements Pagamento {

	@Override
	public void pagar() {
		System.out.println("Pagamento realizado via Pix");		
	}	
}

public class Programa {

	public static void main(String[] args) {
		
		Pagamento pagamento = new Pix();
		
		pagamento.pagar();

	}

}
