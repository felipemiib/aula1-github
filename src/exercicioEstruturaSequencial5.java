import java.util.Scanner;

public class exercicioEstruturaSequencial5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double vPeca1, vPeca2, valorTotal;
		int nPeca1, qPeca1, nPeca2, qPeca2;
		
		nPeca1 = sc.nextInt();
		qPeca1 = sc.nextInt();
		vPeca1 = sc.nextDouble();
		
		nPeca2 = sc.nextInt();
		qPeca2 = sc.nextInt();
		vPeca2 = sc.nextDouble();
		
		valorTotal = qPeca1 * vPeca1 + qPeca2 * vPeca2;
		
		System.out.printf("O valor a pagar é de $ %.2f%n", + valorTotal);

	}

}
