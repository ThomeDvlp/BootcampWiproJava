package aulas.colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MisturadoSET {
	
	public static void main(String[] args) {
		
		
		HashSet conjunto = new HashSet();
		conjunto.add(1);
		conjunto.add("Ola Mundo");
		conjunto.add(true);
		conjunto.add('a');
		
		//descobrir tamanho
		System.out.println(conjunto.size());
		
		// nao aceira repeticao
		conjunto.add('a');
		
		System.out.println(conjunto.size());
		
		
		conjunto.remove('a');
		
		System.out.println(conjunto.size() + "\n");
		
		// verificar se estar presente ou n
		System.out.println("conjunto.contains('a'): " + conjunto.contains('a') + "\n");
		
		
		Set nome = new HashSet();
		nome.add("string");
		nome.add('j');
		nome.add('a');
		nome.add(true);
		nome.add(1);
		System.out.println("nome :" + nome + "\n");
		
		
		Set letras = new HashSet();
		letras.add('j');
		letras.add('o');
		letras.add('n');
		letras.add('a');
		letras.add('t');
		letras.add('h');
		letras.add('A');
		letras.add('N');
		
		System.out.println("letras: " +letras+ "\n");
//        System.out.println("Steam: " + Stream.of(letras).filter(l -> l.equals("a")).collect(Collectors.toList()));
		//interseção
		nome.retainAll(letras);
		System.out.println("nome.retainAll.letras: " + nome + "\n");
		
		//união entre os 2 conjuntos
		nome.addAll(letras);
		System.out.println(nome + "\n");
		
		// remover
		nome.remove("Nome :");
		
		// limpar
		nome.clear();
		System.out.println(nome);
		
		

		
	}

}
