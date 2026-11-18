package enums;

enum Status { 
	PENDENTE, 
	APROVADO, 
	CANCELADO 
}

public class Programa {

	public static void main(String[] args) {
		
		Status pedido = Status.APROVADO; 
		
		System.out.println(pedido);

	}

}
