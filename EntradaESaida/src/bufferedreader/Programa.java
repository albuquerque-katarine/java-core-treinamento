package bufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programa {

	public static void main(String[] args) {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			System.out.print("Informe seu nome: ");
			String nome = entrada.readLine();
			System.out.println(nome);
			
		} catch (IOException e) {			
			
			e.printStackTrace();
		}

	}

}
