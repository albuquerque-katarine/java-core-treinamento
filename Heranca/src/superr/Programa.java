package superr;

class Animal {
	void comer() {
		System.out.println("Animal comendo");
	}
}

class Cachorro extends Animal {
	void alimentar() {
		super.comer();
	}
}

public class Programa {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		
		cachorro.alimentar();

	}

}
