package switchs;

public class Programa {

	public static void main(String[] args) {
		
		int opcao = 2;
		
		switch (opcao) {
			case 1: 
				System.out.println(" Cadastrar");
				break;
			case 2: 
				System.out.println(" Consultar");
				break;
			case 3: 
				System.out.println(" Excluir");
				break;
			default: 
				System.out.println(" Opção inválida");
		}

	}

}
