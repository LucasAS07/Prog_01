package Aula04;

public class Professor extends Funcionario{
	private String titulo;
	
	public Professor(String nome, String email, Integer idade, float salario, String titulo) {
		super(nome,email,idade,salario);
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "* Professor:\n "
				+ "Nome    = " + super.getNome() + "\n"
				+ "Email   = " + super.getEmail() + "\n"
				+ "Idade = " + super.getIdade() + "\n"
				+ "Salario = " + super.getSalario() + "\n"
				+ "titulo = " + titulo + "\n";
	}
	
	
}
