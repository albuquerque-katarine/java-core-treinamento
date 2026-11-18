package multiplas;

public class Programa {

	public static void main(String[] args) {
		
		try {
			int numero = Integer.parseInt("abc");
		} catch (NumberFormatException e) {
			System.out.println("Número inválido");
		} catch (Exception e) {
			System.out.println("Erro inesperado");
		}

	}

}
