package trywithresources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

// try-with-resources

public class Programa {

	public static void main(String[] args) throws IOException {
		
		try(BufferedReader leitor = new BufferedReader(new StringReader("Olá Java"))) {
			System.out.println(leitor.readLine());
		}

	}

}
