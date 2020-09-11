import java.util.Scanner;

public class exercicioEstruturaSequencial4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nFuncionario;
		int nHoras;
		double vHora;
		
		nFuncionario = sc.nextInt();
		nHoras = sc.nextInt();
		vHora = sc.nextDouble();
		
		double salario = nHoras * vHora;
		System.out.println("O número do funcionário é " + nFuncionario);
		System.out.println("O valor do salário mensal é de $" + salario);
		
		sc.close();
	}

}
