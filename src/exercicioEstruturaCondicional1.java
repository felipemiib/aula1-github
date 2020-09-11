import java.util.Scanner;

public class exercicioEstruturaCondicional1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um valor para verificação:");
		int n = sc.nextInt();
		
		if (n < 0) {
			System.out.println("Negativo!");
		} else {
			System.out.println("Não negativo!");
		}
		
		sc.close();
	}

}
