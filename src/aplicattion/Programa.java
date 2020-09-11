package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Insira os valores do triangulo X");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Insira os valores do triangulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Área do triangulo X: %.4f%n", + areaX);
		System.out.printf("Área do triangulo X: %.4f%n", + areaY);
		
		if (areaX > areaY) {
			System.out.println("A maior área é de X com " + areaX + " metros.");
		} else {
			System.out.println("A maior área é de Y com " + areaY + " metros.");
		}
		
		sc.close();
	}

}
