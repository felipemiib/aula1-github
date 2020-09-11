import java.util.Scanner;

public class exercicioResolvidoEstruturaRepetitiva1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor de X");
		int numero = sc.nextInt();
		
		if (numero <= 0 && numero >= 1000) {
			System.out.println("Informe o valor no intervalo entre 0 - 1000");
			System.out.println("Informe o valor no intervalo entre 0 - 1000");
		}
		
		int soma = 0;
		for (int i = 0; i < numero; i++) {
			if (i % 2 != 0) {                              // inserir condição para identificar numero impar
				System.out.println(i);
			}
			
			
			// soma = soma+1;
			// System.out.println(i);
		}
		System.out.println("");
		// System.out.println("O valor da soma dos numeros impar é de: " + soma);
		sc.close();
	}

}
