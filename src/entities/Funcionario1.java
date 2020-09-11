package entities;

public class Funcionario1 {
	
	private String nome;
	private Integer id;
	private Double salario;

	public Funcionario1() {
		
	}
	
	
	public Funcionario1(String nome, Integer id, Double salario) {
		super();
		this.nome = nome;
		this.id = id;
		this.salario = salario;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSalario() {
		return salario;
	}

	public void aumentoSalario(double percentage) {
		salario += salario * percentage / 100;
	}
	
	@Override
	public String toString() {
		return id
			   + ", "
			   + nome
			   +", "
			   + String.format("%.2f", salario);
			
					
	}
	
}
