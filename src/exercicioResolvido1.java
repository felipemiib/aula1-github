import java.util.Scanner;

public class exercicioResolvido1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2;
		double notaFinal;
		System.out.println("Insira a primeira nota:");
		nota1 = sc.nextDouble();
		System.out.println("Insira a segunda nota:");
		nota2 = sc.nextDouble();
		notaFinal = nota1 + nota2 / 2;
		
		if (notaFinal > 60) {
			System.out.printf("Nota final %.2f%n", + notaFinal);
			System.out.println("Aprovado");
		} else {
			System.out.printf("Nota final %.2f%n", + notaFinal);
			System.out.println("Reprovado");
		}
		
		sc.close();

	}

}
