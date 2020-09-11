import java.util.Scanner;

public class exercicioEstruturaRepetitivaWHILE1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe sua senha:");
		int senhaInformada = sc.nextInt();
		int senhaCorreta = 2002;
		
		while (senhaInformada != senhaCorreta) {
			System.out.println("Senha Incorreta");
			senhaInformada = sc.nextInt();
		} 
			System.out.println("Acesso Permitido!");
		
		
		sc.close();
		
		
	}

}
