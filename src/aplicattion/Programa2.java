package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Programa2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.print("Nome: ");		
		func.nome = sc.next();
		
		System.out.print("Salario Bruto: ");
		func.SalarioBruto = sc.nextDouble();
		
		System.out.print("Taxa: ");
		func.imposto = sc.nextDouble();
		
		System.out.println("Funcionário: " + func);
		
		System.out.print("Qual porcentagem de salário? ");
		double percentage = sc.nextDouble();
		func.reajusteSalario(percentage);
		
		System.out.println("Atualização: " + func);
		
		
		sc.close();
		
	}

}
