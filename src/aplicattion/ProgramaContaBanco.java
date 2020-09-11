package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBanco;



public class ProgramaContaBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ContaBanco cb;
		
		System.out.print("Informe numero de conta: ");
		int numeroConta = sc.nextInt();
		System.out.print("Informe titula da conta: ");
		String titular = sc.next();
		System.out.print("Desejar realizar deposito inicial? ");
		char resposta = sc.next().charAt(0); // para inserir apenas 1 caracter
		
		if (resposta == 'y') {
			System.out.print("Informe o valor de deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			cb = new ContaBanco(titular, numeroConta, depositoInicial);
		} else {
			cb = new ContaBanco(titular, numeroConta);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(cb);
		
		System.out.print("Informe o valor de deposito: ");
		double valorDeposito = sc.nextDouble();
		cb.deposit(valorDeposito);
		
		System.out.println("Dados de conta atualizado: ");
		System.out.println(cb);

		System.out.print("Informe o valor de deposito: ");
		double valorSaque = sc.nextDouble();
		cb.deposit(valorSaque);
		
		
		sc.close();
	}

	
}
