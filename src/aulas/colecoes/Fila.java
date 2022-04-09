package aulas.colecoes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		// gera error
		// add para filas
		fila.offer("Bruce"); // diferenca quando fila esta cheia
		fila.add("Bruna"); // retorna falso
		fila.offer("Lucas"); // retorna excecao
		fila.offer("Mari");
		fila.offer("Santos");

		// pegar obj da fila
		// pega o primeiro porem ñ remove
		System.out.println(fila.peek()); // quando vazia retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // diferença quando vazia retorna excecao
		System.out.println(fila.element());

		// verificar se está vazia
		fila.isEmpty();

		System.out.println(fila);
		// retorna e remove o proximo elemento da fila
		fila.poll();
		fila.poll();
		fila.remove(); // quando fila vazia lança excecao
		fila.poll();
		fila.poll();
		fila.poll();
		System.out.println(fila.poll()); // quando fila vazia retorna null
		System.out.println(fila);
		
		Queue<String> fila2 = new LinkedList<String>();
	}

}
