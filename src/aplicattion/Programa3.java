package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.AlunosNotas;

public class Programa3 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		AlunosNotas an = new AlunosNotas();
		System.out.println("Informe seu Nome e notas:");
		an.nome = sc.next();
		an.n1 = sc.nextDouble();
		an.n2 = sc.nextDouble();
		an.n3 = sc.nextDouble();
		
		System.out.println("Nota final é " + an.notaFinal());
		
		if (an.notaFinal() < 60) {
			System.out.println("REPROVADO");
			System.out.println("MISSING " + an.pontosFaltantes());
		} else {
			System.out.println("APROVADO");
		}
		
		
		sc.close();
	}

}
