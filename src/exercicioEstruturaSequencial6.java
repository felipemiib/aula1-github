import java.util.Scanner;

public class exercicioEstruturaSequencial6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, vTriangulo, vCirculo, vTrapezio, vQuadrado, vRetangulo;
		double pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		vTriangulo = A*C/2;
		vCirculo = C*C*pi;
		vTrapezio = C*(A+B)/2;
		vQuadrado = Math.pow(B, 2.0);
		vRetangulo = A*B;
		
				
		
		System.out.printf("TRIANGULO: %.3f%n", + vTriangulo);
		System.out.printf("TRIANGULO: %.3f%n", + vCirculo);
		System.out.printf("TRIANGULO: %.3f%n", + vTrapezio);
		System.out.printf("TRIANGULO: %.3f%n", + vQuadrado);
		System.out.printf("TRIANGULO: %.3f%n", + vRetangulo);
		
		

	}

}
