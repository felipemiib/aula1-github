import java.util.Scanner;

public class exercicioResolvido2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a < b && a < c) {
			System.out.println("Menor é o " + a);
		} else if (b < a && b < c) {
			System.out.println("Menor é o " + b);
		} else {
			System.out.println("Menor é o " + c);
		}

	}

}
