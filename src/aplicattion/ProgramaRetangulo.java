package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class ProgramaRetangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
						
		Retangulo ret = new Retangulo();
		
		
		System.out.println("Entre with the width and height: ");
		
		ret.width = sc.nextDouble();
		ret.height = sc.nextDouble();
		
		System.out.println("Área: " + ret.area());
		System.out.println("Perímetro: " + ret.perimetro());
		System.out.println("Diagonal: " + ret.diagonal());
		
		sc.close();
	}

}
