package finallys;

public class Programa {

	public static void main(String[] args) {
		
		try {
			System.out.println("Executando");
		} catch (Exception e) {
			System.out.println("Erro");
		} finally {
			System.out.println("Finalizado");
		}

	}

}
