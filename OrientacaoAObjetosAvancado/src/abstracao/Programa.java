package abstracao;

abstract class Animal {
	abstract void emitirSom();
}

class Gato extends Animal {
	@Override
	void emitirSom() {
		System.out.println("Miau");
	}
}

public class Programa {

	public static void main(String[] args) {
		
		Animal animal = new Gato();
		
		animal.emitirSom();

	}

}
