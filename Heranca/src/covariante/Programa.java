package covariante;

class Animal {
	
	Animal criar() {
		return new Animal();
	}
}

class Cachorro extends Animal {
	@Override
	Cachorro criar() {
		return new Cachorro();
	}
}

public class Programa {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		
		cachorro.criar();

	}

}
