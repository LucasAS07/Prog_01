package Aula04;

public class Aluno extends Pessoa {
	
	private String matricula;
	private String dataMatricula;
	private String curso;
	
	public Aluno(String nome, String email, Integer idade, String matricula, String dataMatricula, String curso) {
		super(nome, email, idade);
		this.matricula = matricula;
		this.dataMatricula = dataMatricula;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "* Aluno:\n"
				+ "Nome    = " + super.getNome() + "\n"
				+ "Email   = " + super.getEmail() + "\n"
				+ "Idade = " + super.getIdade() + "\n"
				+ "Matricula = " + this.getMatricula() + "\n"
				+ "Data Matricula = " + this.getDataMatricula() + "\n"
				+ "Curso = " + this.getCurso() +"\n"; 
				
	}
	
	
	
}


