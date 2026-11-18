package serializacao;

import java.io.Serializable;

class Pessoa implements Serializable { 
	String nome = "Ana"; 
}

public class Programa {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		System.out.println(p.nome);
	}

}
