import java.util.Scanner;

public class exercicioEstruturaCondicional5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int c1 = 1;
		int c2 = 2;
		int c3 = 3;
		int c4 = 4;
		int c5 = 5;
		double p1 = 4.00;
		double p2 = 4.50;
		double p3 = 5.00;
		double p4 = 2.00;
		double p5 = 2.00;
		double vTotal;
		System.out.println("Informe o CÓDIGO do produto");
		int codigo = sc.nextInt();
		System.out.println("Informe a QUANTIDADE vendida");
		int qtde = sc.nextInt();
		
		if (codigo == c1) {
			vTotal = p1 * qtde;
		} else if (codigo == c2) {
			vTotal = p2 * qtde;
		} else if (codigo == c3) {
			vTotal = p3 * qtde;
		} else if (codigo == c4) {
			vTotal = p4 * qtde;
		} else {
			vTotal = p5 * qtde;
		}
			System.out.printf("O valor total a ser pago é R$ %.2f%n", + vTotal);
		sc.close();
	}

}
