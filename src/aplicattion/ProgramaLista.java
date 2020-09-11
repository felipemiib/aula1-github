package aplicattion;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.text.Position;

import entities.Funcionario1;

public class ProgramaLista {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantos funcionarios serão cadastrados: ");
		
		List<Funcionario1> list = new ArrayList<>(); 
		Integer n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Funcionário #" + (i + 1) + ": ");
			System.out.print("Id:");
			Integer id = sc.nextInt();
			
			while (temId(list, id)) {
				System.out.println("Esse ID ja está sendo utilizado. Tente novamente: ");
				id = sc.nextInt();
			}
			
			
			
			sc.nextLine();
			System.out.print("Nome:");
			String nome = sc.nextLine();
			System.out.print("Salario:");
			Double salario = sc.nextDouble();
			
			Funcionario1 emp = new Funcionario1(nome, id, salario);
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("Informe o ID do funcionario para aumento de salario: ");
		Integer idFuncionario = sc.nextInt();
		Funcionario1 emp = list.stream().filter(x -> x.getId() == idFuncionario).findFirst().orElse(null);
		//Integer pos = position(list, idFuncionario);
		
		if (emp == null) {
			System.out.println("Não existe funcionário com ID informado");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.aumentoSalario(percent);
		}
		sc.close();
	}
		
		public static Integer position(List<Funcionario1> list, int id) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getId() == id) {
					return i;
				}
			}
			return null;
			}
	
			public static boolean temId(List<Funcionario1> list, int id) {
			Funcionario1 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			return emp != null;
			}
}	
	
	
