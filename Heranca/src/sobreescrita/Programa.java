package sobreescrita;


class Animal {
	void comer() {
		System.out.println("Animal comendo");
	}
	
	void emitirSom() {
		System.out.println("Som generico");
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
		
		Cachorro cachorro = new Cachorro();
		cachorro.emitirSom();

	}

}
