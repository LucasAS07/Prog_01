package Aula04;

public class Funcionario extends Pessoa {
	private float salario;
	
	public Funcionario(String nome, String email, float salario) {
		super(nome, email);
		this.salario = salario;
	}
	
	public Funcionario(String nome, String email, Integer idade, float salario) {
		super(nome, email, idade);
		this.salario = salario;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "* Funcionario:\n"
				+ "Nome    = " + super.getNome() + "\n"
				+ "Email   = " + super.getEmail() + "\n"
				+ "Idade = " + super.getIdade() + "\n"
				+ "Salario = " + salario + "\n";
				
	}
	
	
		
}
