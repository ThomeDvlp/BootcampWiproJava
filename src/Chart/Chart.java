package Chart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Chart {
	public static void main(String[] arg) {
		String[] products = { "Leite", "Cereal", "Arroz", "Atum", "Feijão", "Azeite", "Óleo", "Sabão", "Sal",
				"Açúcar" };
		Integer[] inventory = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		Float[] prices = { 4.57f, 3.02f, 9.43f, 3.55f, 6.55f, 4.55f, 7.33f, 1.99f, 3.82f, 4.29f };
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> productCode = new ArrayList();
		ArrayList<Integer> productQuantity = new ArrayList();
		
		presentation();
		market(products, inventory, prices, productCode, productQuantity);
	}
		
	public static void market(
			String[] products,
			Integer[] inventory,
			Float[] prices,
			ArrayList<Integer> productCode,
			ArrayList<Integer> productQuantity
			) {
		Integer[] inventoryCopy = Arrays.copyOf(inventory, inventory.length);
		boolean checker = false;
		
		do {
			int choice;
			int code = 0, quantity = 0;
			System.out.println("\t\t\t WIPRO STORE");
			System.out.println("=======================================================");
			System.out.println("CÓDIGO \t\t PRODUTO \t\t QTND. PRODUTOS \t\t PREÇO UNIT.");
			for(int i = 0; i < products.length; i++) {
				System.out.println(i + 1 + "\t\t" + products[i] + "\t\t" + inventory[i] + "\t\t" + "R$" + prices[i]);
			}
			System.out.println("=======================================================");
			
			code = inputValidator("\nCOD PROD\nDigite o código do produto desejado: ", 
					"\nERROR - Valor Invalido\nO sem correspondencia!\nInforme um valor numerico entre 1 a 10", 
					"[0-9]*");
			code -=1;
			if(code >= products.length || code < 0) {
				System.out.println("O produto informado não está na lista no momento, selecione outro produto");
				continue;
			} else {
				productCode.add(code);
			}
			
			quantity = inputValidator(
					"\nQTN PROD\nDigite a quantity que deseja colocar no carrinho: ", 
					"\nERROR - Valor Invalido\nInforme um valor numerico entre 1 a 10", "[0-9]*");
            if (inventory[code] == 0 || quantity > inventory[code]) {
                System.out.println("A quantity informada é maior do que o numero disponivel em inventory");
                continue;
            } else {
                productQuantity.add(quantity);
                inventory[code] -= quantity;
            }

            System.out.println("\nDeseja continuar as compras?\n");
            System.out.printf("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---%n");
            choice = inputValidator(
                    "[1] - Incluir mais itens no seu carrido.\n[2] - Ir para carrinho de compras e formas de pagamento.\n",
                    "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---",
                    "[1-2]",
                    "Opção Invalida");
            if(choice == 1) {
            	System.out.println("Voltando a prateleira de produtos");
            	continue;
            } else if ( choice == 2){
                boolean finish = market(productCode, productQuantity, products, prices, inventory, inventoryCopy);
                inventory = finish ? inventoryCopy : inventory;
                System.out.println("Deseja voltar para a pratileira de compras?");
                System.out.printf("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---%n");
                choice = inputValidator(
                        "\n\n[1] - Sim refazer compras.\n[2] - Não, sair do mercado.\n\n",
                        "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---",
                        "[1-2]",
                        "Opção Invalida");
            	
            
            if(choice == 1) {
                System.out.println("Voltando a prateleira de produtos");
                continue;           	
            } else {
            	checker = true;
            }
         } 
		}while(!checker);
          
	}
		

		public static int inputValidator(
	            String textIn,
	            String textOut,
	            String regex) {
	        return inputValidator(textIn, textOut, regex, "");
	    }
	    public static int inputValidator(
	            String textIn,
	            String textOut,
	            String regex,
	            String txtAlert) {
	        Scanner nv = new Scanner(System.in);
	        String valorDigitado;
	        boolean checker = false;
	        int integerReturn = 0;

	        do {
	            System.out.println(textIn);
	            valorDigitado = nv.next();
	            if (valorDigitado.matches(regex)) {
	            	integerReturn = Integer.parseInt(valorDigitado);
	                checker = true;
	            } else {
	                System.out.println(textOut);
	                System.out.println(txtAlert);
	                continue;
	            }
	        } while (!checker);
	        return integerReturn;
	    }
	    public static boolean market(
	    		@NotNull ArrayList<Integer> carrinhoCodigoProduto, 
	    		ArrayList<Integer> carrinhoQuantidade, 
	    		String[] produtos, 
	    		Float[] precos, 
	    		Integer[] estoque, 
	    		Integer[] estoqueCopia) {

	        float valorTotalDeCompra = 0;
	        float valorImposto = 0;
	        System.out.printf("%nITENS NO CARRINHO%n" +
	                "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---%n" +
	                "Nome Prod. \tQtde. no Carrinho \tPreço Unit. \tPreço Total%n");
	        for (int i = 0; i < carrinhoCodigoProduto.size(); i++) {
	            System.out.printf("%s\t\t\t%s\t\t\t\t RS %5.2f\t\t R$ %5.2f%n",
	                    produtos[carrinhoCodigoProduto.get(i)],
	                    carrinhoQuantidade.get(i),
	                    precos[carrinhoCodigoProduto.get(i)],
	                    precos[carrinhoCodigoProduto.get(i)] * carrinhoQuantidade.get(i)
	            );
	            valorTotalDeCompra += (precos[carrinhoCodigoProduto.get(i)] * carrinhoQuantidade.get(i));
	            //valorImposto = (9.0f / 100.0f) * valorTotalDeCompra;

	        }
	        System.out.printf("%nTOTAL - O valor total da compra R$: %5.2f%n", valorTotalDeCompra);
	        System.out.printf("%n--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---%n" +
	                "[1] - Escolher forma de pagamento. %n" +
	                "[2] - Cancelar compra e esvaziar carrinho. %n" +
	                "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---%n");
	        float desconto = 0.0f;
	        float valorASerPago = 0.0f;
	        boolean checker = false;
	        do {
	            Scanner sc = new Scanner(System.in);
	            String choice = sc.next();
	            if (choice.matches("[1-2]*")) {
	                if (choice.matches("1")) {
	                    int payMethod = formasDePagamento();

	                    if (payMethod == 1) {
	                        desconto = ((20.0f / 100) * valorTotalDeCompra);
	                        valorASerPago = valorTotalDeCompra - desconto;
	                    } else if (payMethod == 2) {
	                        desconto = ((10.0f / 100) * valorTotalDeCompra);
	                        valorASerPago = valorTotalDeCompra - desconto;
	                    }else{
	                        desconto = 0.0f;
	                        valorASerPago = valorTotalDeCompra;
	                    }
	                } else if (choice.matches("2")) {
	                    carrinhoCodigoProduto.clear();
	                    carrinhoQuantidade.clear();
	                    System.out.println("\nCarrinho limpo com sucesso - Obrigado volte sempre\n\n");
	                    checker = true;
	                }
	            } else {
	                System.out.println("Valor informado não aceito");
	                System.out.printf("%n%n--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---%n" +
	                        "[1] - Escolher forma de pagamento. %n" +
	                        "[2] - Cancelar compra e esvaziar carrinho. %n" +
	                        "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---%n%n");
	            }

	            float tributos = 0.09f * valorASerPago;
		
	}


//		System.out.print("Olá! Digite o código do produto desejado: ");
//		int code = input.nextInt();
//		System.out.print("Insira a quantity do produto desejado: ");
//		int quantity = input.nextInt();
//		if (code > products.length) {
//			System.out.println("Produto inexistente");
//		}
//		if (quantity > inventory[code - 1]) {
//			System.out.println("quantity indisponível");
//		}
//		System.out.println(quantity + " un de " + products[code - 1] + " adicionado com sucesso no carrinho");
//		System.out.println("Você deseja adicionar mais um produto? (S/N): ");
//		String response = input.next();
//
//		do {
//			System.out.println("=======================================================");
//			System.out.print("Olá! Digite o código do produto desejado: ");
//			int code = input.nextInt();
//			System.out.print("Insira a quantity do produto desejado: ");
//			int quantity = input.nextInt();
//			if (code > products.length) {
//				System.out.println("Produto inexistente");
//			}
//			if (quantity > inventory[code - 1]) {
//				System.out.println("quantity indisponível");
//			}
//			System.out.println(quantity + " un de " + products[code - 1] + " adicionado com sucesso no carrinho");
//			System.out.println("Você deseja adicionar mais um produto? (S/N): ");
//			String response = input.next();
//		} while (response.equalsIgnoreCase("s"));
	}
}
