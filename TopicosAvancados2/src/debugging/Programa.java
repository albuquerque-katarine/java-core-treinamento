package debugging;

public class Programa {

	public static void main(String[] args) {
		
		/*
		 * Breakpoint: ponto de parada da execução. 
		 * Step Over: executa a próxima linha sem entrar nos métodos chamados. 
		 * Step Into: entra no método chamado. 
		 * Step Out: sai do método atual. 
		 * Watch: acompanha o valor de variáveis e expressões. 
		 * Resume: continua a execução do programa.
		 * */

		int numero = 10;
		int dobro = numero * 2; 
		System.out.println(dobro);
	}

}
