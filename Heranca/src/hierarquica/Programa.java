package hierarquica;

class Animal {
	void respirar() {
		System.out.println("Respirando");
	}
}

class Gato extends Animal {
	
}

class Cachorro extends Animal {
	
}

public class Programa {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro();
		cachorro.respirar();
		
		Gato gato = new Gato();
		gato.respirar();

	}

}
