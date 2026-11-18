package stack;

import java.util.Stack;

public class Programa {

	public static void main(String[] args) {
		
		Stack <Integer> pilha = new Stack<>(); 
		
		pilha.push(10);
		pilha.push(20);
		
		System.out.println(pilha.pop());

	}

}
