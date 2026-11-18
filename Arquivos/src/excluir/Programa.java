package excluir;

import java.io.File;

public class Programa {

	public static void main(String[] args) {
		
		File arquivo = new File("dados.txt");
		
		if(arquivo.delete()) {
			System.out.println("Arquivo excluído");
		} else {
			System.out.println("Não foi possível excluir");
		}

	}

}
