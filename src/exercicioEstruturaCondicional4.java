import java.util.Scanner;

public class exercicioEstruturaCondicional4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hora de Início");
		int horaInicio = sc.nextInt();
		System.out.println("Hora de Término");
		int horaFim = sc.nextInt();
		int duracaoHoras;
		
		
		
		if (horaFim > horaInicio) {
			duracaoHoras = horaFim - horaInicio;
		} else {
			duracaoHoras = 24 - horaInicio + horaFim;
		}
		
		System.out.println("A duração é de " + duracaoHoras + " horas");
		
		sc.close();
	}

}
