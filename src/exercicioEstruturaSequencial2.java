import java.util.Scanner;

public class exercicioEstruturaSequencial2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double entrada1;
		
		entrada1 = sc.nextDouble();
		double raio = entrada1 * entrada1;
		double area = raio * pi;
		
		System.out.printf("O raio é de %.4f%n", + raio);
		System.out.printf("O área é de %.4f%n", + area);
		
		
		sc.close();
	}

}
