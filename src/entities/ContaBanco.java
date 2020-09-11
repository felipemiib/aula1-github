package entities;

public class ContaBanco {
	
/* ATRIBUTOS */
	
	private String titular;
	private int numeroConta;
	private double saldo;
	
/* CONSTRUTORES */

	public ContaBanco(String titular, int numeroConta, double depositoInicial) {
		this.titular = titular;
		this.numeroConta = numeroConta;
		deposit(depositoInicial);	
	}
	
	public ContaBanco(String titular, int numeroConta) {
		this.titular = titular;
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposit(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor;
	}
	
	public String toString( ) {
		return "Conta " 
				+ numeroConta
				+ ", Titular: "
				+ titular
				+", Balance: $ "
				+ String.format("%.2f", saldo);
	}
}
	
	



	
	
	
	


