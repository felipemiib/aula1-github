import java.util.Scanner;

public class exercicioEstruturaCondicional3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe valor 1");
		int N1 = sc.nextInt();
		System.out.println("Informe valor 2");
		int N2 = sc.nextInt();
		
		if (N1 % N2 == 0 || N2 % N1 == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}

		sc.close();
	}

}
