package trycatch;

public class Programa {

	public static void main(String[] args) {
		
		try {
			int resultado = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Não é possível dividir por zero");
		}

	}

}
