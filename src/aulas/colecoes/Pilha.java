package aulas.colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Homem de Giz");
		livros.add("O Hobbit");
		livros.add("Duna");
		livros.push("Os sabiás da crônica");
		
		
		System.out.println(livros);
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		//remover
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		
		System.out.println(livros);
		
		
	}
	
	
	public static void mudarNome() {
		System.out.println("Olá");
	}
	

}
