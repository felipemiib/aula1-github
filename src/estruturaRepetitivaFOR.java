import java.util.Scanner;

public class estruturaRepetitivaFOR {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe quantidade de repetições:");
		
		int N = sc.nextInt();
		int soma = 0; 
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println(soma);
		sc.close();
	}

}
