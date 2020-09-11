import java.util.Scanner;

public class exercicioEstruturaCondicional2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor para análise:");
		int N = sc.nextInt();
		if (N % 2 != 1) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}

	}

}
