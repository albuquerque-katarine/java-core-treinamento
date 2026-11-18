package datahora;

import java.time.LocalDate;
import java.time.LocalTime;

public class Programa {

	public static void main(String[] args) {
		
		LocalDate data = LocalDate.now();
		LocalTime hora = LocalTime.now(); 
		
		System.out.println(data); 
		System.out.println(hora);

	}

}
