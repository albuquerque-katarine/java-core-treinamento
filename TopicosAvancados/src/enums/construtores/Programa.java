package enums.construtores;

enum Status { 
	APROVADO("Pedido aprovado"), 
	PENDENTE("Aguardando aprovação"); 
	
	private final String descricao; 
	
	Status(String descricao) { 
		this.descricao = descricao; 
	} 
	
	public String getDescricao() { 
		return descricao; 
	}
}

public class Programa {

	public static void main(String[] args) {
		
		System.out.println( Status.APROVADO.getDescricao());
	}

}
