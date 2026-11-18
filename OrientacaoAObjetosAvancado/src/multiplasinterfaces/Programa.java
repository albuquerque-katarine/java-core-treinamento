package multiplasinterfaces;

interface Imprimivel {
	void imprimir();
}

interface Salvavel {
	void salvar();
}

class Documento implements Imprimivel, Salvavel {

	@Override
	public void salvar() {
		System.out.println("Imprimindo");		
	}

	@Override
	public void imprimir() {
		System.out.println("Salvando");		
	}	
}

public class Programa {

	public static void main(String[] args) {
		
		Imprimivel imprimirDoc = new Documento();
		imprimirDoc.imprimir();
		
		Salvavel salvarDoc = new Documento();
		salvarDoc.salvar();
		
	}

}
