import java.util.Locale;

public class Main {
public static void main(String[] args)
	 {
		int y = 32;
		double x = 10.35784;
		double z = 12.35784;
		String nome = "Felipe";
		int idade = 33;
		double renda = 4000.00;
		
		
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO de X = %.2f metros%n", x);
		System.out.printf("RESULTADO de X = %f e RESULTADO Z = %d", x, y);
		System.out.println();
		System.out.printf("%s tem %d anos e ganha R$ %f", nome, idade, renda);

	}

}
