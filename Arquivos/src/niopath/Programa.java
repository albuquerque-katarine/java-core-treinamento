package niopath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Programa {

	public static void main(String[] args) throws IOException {
		
		Path caminho = Path.of("dados.txt");
		
		Files.writeString(caminho, "Olá Java!");
		
		System.out.println(Files.readString(caminho));

	}

}
