package aplicattion;

import java.util.Scanner;

import entities.ConversaoRealDolar;

public class ProgramaIOF {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		ConversaoRealDolar cv = new ConversaoRealDolar();
		
		System.out.println("What is the dollar price?");
		cv.cotacaoDolar = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		cv.qtDolar = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais is $ " + cv.valorPagarReais());
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
