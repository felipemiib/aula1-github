package entities;

public class ConversaoRealDolar {
	
	public static double iof = 0.06;
	
	public double cotacaoDolar;
	public double qtDolar;
	public double valorDolar() {
		return cotacaoDolar * qtDolar; 
	};
	public double calculoIof() {
		return valorDolar() * iof; 
	}
	
	public double valorPagarReais( ) {
		return valorDolar() + calculoIof();
	}
}


