package bufferreaderewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) throws IOException {
		
		try(BufferedWriter escritor = new BufferedWriter(new FileWriter("dados.txt"))) {
			escritor.write("Estudando Java");
		}

	}

}
