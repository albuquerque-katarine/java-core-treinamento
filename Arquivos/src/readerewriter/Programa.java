package readerewriter;

import java.io.FileWriter;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) throws IOException {
		
		try(FileWriter escritor = new FileWriter("dados.txt")) {
			escritor.write("Olá Java");
		}
		
		/*
		 * FileReader: utilizado para ler caracteres de um arquivo. 
		 * FileWriter: utilizado para escrever caracteres em um arquivo.
		 * */

	}

}
