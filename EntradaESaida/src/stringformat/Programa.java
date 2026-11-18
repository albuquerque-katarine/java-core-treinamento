package stringformat;

public class Programa {

	public static void main(String[] args) {
		
		String nome = "Pedro";
		double salario = 2500.50;
		
		String resultado = String.format("Nome: %s | Salário: %.2f%n", nome,salario);
		
		System.out.println(resultado);

	}

}
