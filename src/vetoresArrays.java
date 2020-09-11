import java.util.Locale;
import java.util.Scanner;

public class vetoresArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = 3;
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.println("Media de altura é " + avg);
		
		sc.close();
	}

}
