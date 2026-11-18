package exemplo;

import java.io.ByteArrayInputStream;

public class Programa {

	public static void main(String[] args) {
		
		byte[] dados = {65, 66, 67};
		
		ByteArrayInputStream entrada = new ByteArrayInputStream(dados);
		
		int valor;
		
		while ((valor = entrada.read()) != -1) {
			System.out.println((char) valor); 
		}

	}

}
