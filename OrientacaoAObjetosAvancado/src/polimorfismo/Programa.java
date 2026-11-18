package polimorfismo;

class Animal {
	void emitirSom() {
		System.out.println("Som");
	}
}

class Cachorro extends Animal {
	@Override
	void emitirSom() {
		System.out.println("Au Au");
	}
}

public class Programa {

	public static void main(String[] args) {
		
		Animal animal = new Cachorro();
		animal.emitirSom();

	}

}
