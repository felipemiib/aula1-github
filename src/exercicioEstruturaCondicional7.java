import java.util.Scanner;

public class exercicioEstruturaCondicional7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informar valor de 'X' ");
		double x = sc.nextDouble();
		System.out.println("Informar valor de 'Y' ");
		double y = sc.nextDouble();
		
		if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else {
			System.out.println("Origem");
		}
		
		sc.close();
	}

}
