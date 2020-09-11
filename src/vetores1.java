import java.util.Locale;
import java.util.Scanner;


import entities.Produto1;

public class vetores1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		Produto1[] vect = new Produto1[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Produto1(nome, preco);			
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPreco()/ 3.0;
		}
		
		System.out.println("A média é de " + sum);
		
			
		
		sc.close();
	}

}
