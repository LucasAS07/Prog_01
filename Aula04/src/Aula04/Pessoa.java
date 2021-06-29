package Aula04;

public class Pessoa {
	//Argumentos
	private String nome;
	private String email;
	private Integer idade;
	
	//Construtor
	public Pessoa(String nome, String email) {
		this.nome = nome;
		this.email = email;
		this.idade = 20;
	}
	
	public Pessoa(String nome, String email, Integer idade) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}
	

	//Metodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "* Pessoa:\n"
				+ "Nome = " + this.nome + "\n"
				+ "email = " + this.email + "\n"
				+ "Idade =" + this.idade + "\n";
	}
	
	
	
}
