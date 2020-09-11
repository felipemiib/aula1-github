import java.util.Scanner;

public class exercicioEstruturaRepetitivaWHILE3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor do código:");
		int codigo = sc.nextInt();
		int qtde1 = 0;
		int qtde2 = 0;
		int qtde3 = 0;
				
		while (codigo != 4) {
			if (codigo == 1) {
				qtde1 = qtde1 + 1;
			} else if (codigo == 2) {
				qtde2 = qtde2 + 1;
			} else if (codigo == 3) {
				qtde3 = qtde3 + 1;
			}
		
			codigo = sc.nextInt();			
		}
		
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + qtde1);
		System.out.println("Gasolina: " + qtde2);
		System.out.println("Diesel: " + qtde3);
		
		sc.close();
	}

}
