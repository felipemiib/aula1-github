import java.util.Scanner;

public class exercicioEstruturaRepetitivaWHILE2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe X");
		int x = sc.nextInt();
		System.out.println("Informe Y");
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x < 0 && y < 0 ) {
				System.out.println("Terceiro");

			} else if (x < 0 && y > 0 ) {
				System.out.println("Primeiro");
			} else if (x > 0 && y < 0 ) {
				System.out.println("Quarto");
			} else if (x > 0 && y > 0 ) {
				System.out.println("Segundo");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
		} 
		
		System.out.println("");
		
		sc.close();
	}

}
