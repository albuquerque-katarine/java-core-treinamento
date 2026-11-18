package innerclasse;

class Externa {
	
	class Interna {
		void mostrar() {
			System.out.println("Classe interna");
		}
	}
}

public class Programa {
	
	public static void main(String[] args) {
		
		Externa externa = new Externa();
		
		Externa.Interna interna = externa.new Interna();
		
		interna.mostrar();
	}

}
