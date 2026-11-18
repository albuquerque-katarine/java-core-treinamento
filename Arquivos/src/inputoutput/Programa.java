package inputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		/*
		 * FileInputStream: lê dados de um arquivo em bytes. 
		 * FileOutputStream: escreve dados em um arquivo em bytes.
		 * */
		
		try(FileOutputStream saida = new FileOutputStream("dados.txt")) {
			saida.write("Java".getBytes());
		}

	}

}
