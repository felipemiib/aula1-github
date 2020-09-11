import java.util.Scanner;

public class operadoresAtribuicaoCumulativa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe quantso minutos foi utilizado:"); 
		int minutos = sc.nextInt();
		int vPlano = 50;
		int tPlano = 100;
		
		if (minutos > tPlano) {
			vPlano += (minutos - tPlano) * 2.00;
			System.out.println("Valor a pagar é de $ " + vPlano);
		} else {
			System.out.println("Valor a pagar é de $ " + vPlano);
		}
		
		sc.close();
	}

}
