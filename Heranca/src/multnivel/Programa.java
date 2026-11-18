package multnivel;

class Animal {
	void respirar() {
		System.out.println("Respirando");
	}
}

class Mamifero extends Animal {
	
}

class Cachorro extends Mamifero {
	
}


public class Programa {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		
		cachorro.respirar();

	}

}
