package annotations;

class Animal { 
	void emitirSom() {
		System.out.println(" Som"); 
	} 
}

class Cachorro extends Animal {
	@Override 
	void emitirSom() {
		System.out.println(" Au au"); 
	} 
}

public class Programa {

	public static void main(String[] args) {
		
		/*
		 * @Deprecated: indica que um elemento não é mais recomendado.
		 * @SuppressWarnings: solicita a supressão de determinados avisos. 
		 * @Override: indica sobrescrita de método.
		 * */

	}

}
