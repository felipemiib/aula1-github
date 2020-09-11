package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.AluguelQuartos;

public class vetoresAluguelQuartos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
						
		AluguelQuartos[] vect = new AluguelQuartos[10]; // Lista 10 cópias de ALUGUEL QUARTO
		
		System.out.println("Quantos quartos serão alugados?");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Aluguel # " + i + " :");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Informe seu email: ");
			String email = sc.nextLine();
			System.out.print("Informe numero do quarto desejado: ");
			int nQuarto = sc.nextInt();
					
			vect[nQuarto] = new AluguelQuartos(nome, email);
		}
		
	
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		System.out.println();
		
		
		
		
		sc.close();
	}

}
