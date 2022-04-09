package aulas.colecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NaoMistutadoSET {
	
	public static void main(String[] args) {
		
		Set<String> conjunto = new HashSet<String>();
		
		//conjunto.add(1.3);
		conjunto.add("Jonathan");
		conjunto.add("Jenifer");
		conjunto.add("Ana");
		
		
		
		System.out.println(conjunto);
		
				
		Funcionario joao = new Funcionario(1, "Joao");
		Funcionario maria = new Funcionario(2, "Maria");//1
		
		Set<Funcionario> conjuntoFuncionario = new HashSet<>();
		
		conjuntoFuncionario.add(joao);
		conjuntoFuncionario.add(maria);
		
		
		for (Funcionario funcionario : conjuntoFuncionario) {
			System.out.println(funcionario.getNome());
		}
		
		Set<Integer> conjuntoNumeros = new TreeSet<>();
		conjuntoNumeros.add(1);
		conjuntoNumeros.add(2);
		conjuntoNumeros.add(3);
		conjuntoNumeros.add(4);
		conjuntoNumeros.add(5);
		conjuntoNumeros.add(6);
		conjuntoNumeros.add(7);
		
		Set<String> conjuntoString = new TreeSet<>();
		conjuntoString.add("carro");
		conjuntoString.add("opa");
		conjuntoString.add("epa");
		conjuntoString.add("aba");
		conjuntoString.add("tesla");
		conjuntoString.add("boi");
		conjuntoString.add("bola");
		
		for (int i = 10; i <= 15; i++) conjuntoNumeros.add(i);
		
		for (Integer numero : conjuntoNumeros) System.out.println(numero);
		for (String string : conjuntoString) System.out.println(string + "\n");
		
		
		System.out.println(conjuntoNumeros);
		
		
		ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
		
		Funcionario beto = new Funcionario(3, "Beto");
		Funcionario joana = new Funcionario(3, "Joana");

	}
}
