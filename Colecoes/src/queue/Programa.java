package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Programa {

	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList<>();
		fila.add(10); 
		fila.add(20); 
		
		System.out.println( fila.poll());

	}

}
