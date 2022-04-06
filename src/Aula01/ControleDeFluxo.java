package Aula01;

public class ControleDeFluxo {

	public static void main(String[] args) {
		
		//operadores aritméticos
//		+
//		-
//		*
//		/
//		% operador de módulo (ou resto da divisão)
		
		
		// Operadores relacionais
//		>  maior 
//		>= maior ou igual 
		
//		< menor
//		<= menor ou igual
		
//		operadores de igualdade
//		== igual
//		!= diferente
		
		
		

//		if (expressão booleana) {
		
//		    // bloco de código 1
		
//		} else if (expressão bolena) {
//		    // bloco de código 2
//		} else {
//			
//		}
		
		// if ternario         true       false  
//		(expressão booleana) ? código 1 : código 2;

		int a, b, c;
		a = 10;
		b = 30;
		c = 7;
		
		
		if (a > b) {
			System.out.println("A é maior do que B");
		} else if (a > c) {
			System.out.println("A é maior do que C");
		}else {
			System.out.println("A é menor do que B ou C");
		}	
		

		int numero = 31;
		String parOUimpar = (numero % 2 == 0) ? "Par" : "Impar";
		
		if(numero % 2 == 0) {
			parOUimpar = "par";
//			c = numero;
		} else {
			parOUimpar = "impar";
		}
		
		System.out.println(parOUimpar);
		
		
//		operadores de lógicos
//		
//		&&  - Utilizado quando desejamos que as duas expressões sejam verdadeiras.
//		|| - Utilizado quando precisamos que pelo meno um das expressões seja verdadeira.
		
		
		if((a > b) || (a > c)) {
			System.out.println("a");
		}
		
		
		System.out.println("false && true = " + (primCondicao(false) && segCondicao(true)) + " - sem teste da segunda condição.");

        System.out.println();

        System.out.println("false & true = " +
                (primCondicao(false) & segCondicao(true)) +
                " - com teste da segunda condição.");

        System.out.println();

        System.out.println("true || false = " +
            (primCondicao(true) || segCondicao(false)) +
            " - sem teste da segunda condição.");

        System.out.println();

        System.out.println("true | false = " +
                (primCondicao(true) | segCondicao(false)) +
                " - com teste da segunda condição.");

    }
	
//	modificadorDeAcesso tipo_retorno identificador/nome ([argumentos]) {
//
//		//Corpo do método
//
//		}

    private static boolean primCondicao(boolean retorno){
        System.out.println("Executou o teste da primeira condição");
        return retorno;
    }

    private static boolean segCondicao(boolean retorno){
        System.out.println("Executou o teste da segunda condição");
        return retorno;
    }

}