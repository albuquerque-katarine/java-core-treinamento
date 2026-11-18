package throww;

public class Programa {

	public static void main(String[] args) {
		
		int idade = 15;

		if (idade < 18) {
			throw new IllegalArgumentException("Idade inválida");
		}
		
		System.out.println(idade);

	}

}
