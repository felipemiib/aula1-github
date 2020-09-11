package entities;

public class Funcionario {
	
	public String nome;
	public double SalarioBruto;
	public double imposto;
	
	
	public double salarioLiquido() {
		return
				SalarioBruto - imposto;
	}
	
	public double reajusteSalario(double percentage) {
		return SalarioBruto += SalarioBruto * percentage / 100.0;
	}
	
	public String toString() {
		return nome
			   + ", $ "
			   + salarioLiquido();
	}

}

