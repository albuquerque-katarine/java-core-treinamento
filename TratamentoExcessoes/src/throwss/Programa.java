package throwss;

import java.io.IOException;

public class Programa {

	//O método declara que pode lançar uma IOException.
	static void lerArquivo() throws IOException { 
		throw new IOException(" Erro de leitura");
	}
	
	public static void main(String[] args) {
		
		

	}

}
