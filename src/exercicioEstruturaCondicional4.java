import java.util.Scanner;

public class exercicioEstruturaCondicional4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hora de In�cio");
		int horaInicio = sc.nextInt();
		System.out.println("Hora de T�rmino");
		int horaFim = sc.nextInt();
		int duracaoHoras;
		
		
		
		if (horaFim > horaInicio) {
			duracaoHoras = horaFim - horaInicio;
		} else {
			duracaoHoras = 24 - horaInicio + horaFim;
		}
		
		System.out.println("A dura��o � de " + duracaoHoras + " horas");
		
		sc.close();
	}

}
