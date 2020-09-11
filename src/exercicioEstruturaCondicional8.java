import java.util.Scanner;

public class exercicioEstruturaCondicional8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor do salario:");		
		double salario = sc.nextDouble();
		double imposto;
		if (salario > 0 && salario <= 2000) {
			System.out.println("Isento");
		} else if (salario > 2000 && salario <= 3000) {
			imposto = (salario - 2000) * 0.08;
			System.out.println("R$ " + imposto);
		} else if (salario > 3000 && salario <= 4500) {
			imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
			System.out.println("R$ " + imposto);
		} else {
			imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
			System.out.println("R$ " + imposto);
		}
		
		sc.close();

	}

}
