import java.util.Scanner;

public class entradaDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Voc� digitou: " + x + " " + y + " " + z);
		/* System.out.printf("Voc� digitou: %.2f%n", x);*/
		
		
		sc.close();

	}

}
