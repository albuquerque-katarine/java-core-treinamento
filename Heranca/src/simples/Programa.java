package simples;

class Veiculo {
	void mover() {
		System.out.println("Veículo em movimento");
	}
}

class Carro extends Veiculo {
	
}

public class Programa {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.mover();
	}

}
