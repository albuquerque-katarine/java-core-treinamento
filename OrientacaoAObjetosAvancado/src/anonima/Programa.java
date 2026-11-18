package anonima;

interface Saudacao {
	void falar();
}

public class Programa {

	public static void main(String[] args) {
		
		Saudacao saudacao = new Saudacao() {

			@Override
			public void falar() {
				System.out.println("Olá");				
			}			
		};
		
		saudacao.falar();
	}

}
