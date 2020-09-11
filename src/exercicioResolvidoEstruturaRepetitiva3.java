import java.util.Locale;
import java.util.Scanner;

public class exercicioResolvidoEstruturaRepetitiva3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Número de Casos de Teste");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double media;
			System.out.println("Informe 3 valores de casos de teste");
			double v1 = sc.nextDouble();
			double v2 = sc.nextDouble();
			double v3 = sc.nextDouble();
			
			media = (v1 * 2 + v2 * 3 + v3 * 5)/10;
					
			System.out.print(v1 + ", ");
			System.out.print(v2 + ", ");
			System.out.println(v3);
			System.out.printf("A media é de %.1f%n", + media);
			
		}
		
			sc.close();

	}

}
