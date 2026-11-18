package scanner;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Olá, "+nome+"!");
		
		entrada.close();
		
		/*
		 * nextInt(): número inteiro.
		 * nextDouble(): número decimal.
		 * next(): uma palavra.
		 * nextLine(): uma linha de texto.
		 * nextBoolean(): valor booleano.
		 * */

	}

}
