package entities;

public class Produto {

	
	/* ATRIBUTOS */
	
	
	private String nome;
	public double preco;
	public int quantidade;

	
	
	
	
	
	
	/* CONSTRUTORES */
	
	public Produto(String nome, double preco, int quantidade ) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public void setName(String nome) {
		this.nome = nome;
				
	}
	
	public String getName() {
		return nome;
	}
	
	
	/* METODOS - FUNÇÔES */
	
	public double valorTotalEstoque() {
		return preco * quantidade;
	}
	
	public void addProduto(int quantidade) {
		this.quantidade +=  quantidade;
		
	}
	
	
	
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome
				+ ",$ "
				+ String.format("%.2f", preco)
				+ ", "
				+ quantidade
				+"units, Total: $ "
				+String.format("%.2f", valorTotalEstoque());
				
	}
	

}
