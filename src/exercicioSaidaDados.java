
public class exercicioSaidaDados {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.00;
		double price2 = 650.00;
		double price3 = 53.234567;
		
		System.out.printf("%s, which price is %.2f", product1, price1);		
		System.out.println();
		System.out.printf("%s, which price is %.2f", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %s", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %f", price3);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.3f", price3);
		System.out.println();
		System.out.printf("Rouded (three decimal palces): %.3f", price3);
		System.out.println();
		System.out.printf("US decimal point: %.3f", price3);

	}

}
