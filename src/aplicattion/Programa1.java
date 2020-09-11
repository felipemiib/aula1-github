package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Programa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
					
		
		
		System.out.println("Informe os dados do produto:");
		System.out.print("Nome:");
		String nome = sc.nextLine();			// Variável temporária para inserir valores antes do calculo
		
		System.out.print("Preço:");
		double preco = sc.nextDouble();			// Variável temporária para inserir valores antes do calculo
		
		System.out.print("Quantidade:");
		int quantidade = sc.nextInt();		// Variável temporária para inserir valores antes do calculo
		
		Produto p1 = new Produto(nome, preco, quantidade);
		p1.setName("Computador");			// SET
		
		System.out.println("Product data: " + p1.getName() + ", " + p1.preco + ", " + p1.quantidade + " Total: $ " + p1.valorTotalEstoque());
		System.out.println(p1.getName() + " ," + " " + p1.preco + " ," + " " + p1.quantidade);  // GET
		
		System.out.println();
		System.out.println("Informe o numero de produtos para adicionar:");
		
		quantidade = sc.nextInt();
		p1.addProduto(quantidade);
		
		System.out.println("Produto Atualizado:" + p1);
		
		
		System.out.println("Informe o numero de produtos para remover:");
		
		quantidade = sc.nextInt();
		p1.removerProduto(quantidade);
		
		System.out.println("Produto Atualizado:" + p1);
	
		
		
		
		
		
		sc.close();
	}

}
