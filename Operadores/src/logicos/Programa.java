package logicos;

public class Programa {

	public static void main(String[] args) {
		
		int idade = 25;
		System.out.println( idade >= 18 && idade <= 60);
		System.out.println( idade < 18 || idade > 60);
		System.out.println(!( idade >= 18));
		
		/*
		 * &&: E (AND)
		 * ||: OU (OR)
		 * !: NÃO (NOT)
		 * */

	}

}
