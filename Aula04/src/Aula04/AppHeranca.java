package Aula04;

public class AppHeranca {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Nome1", "email1@hotmail.com");
		System.out.println(p.toString());
		
		Funcionario f = new Funcionario("Nome2","email2@hotmial.com",7000);
		System.out.println(f.toString());
		
		Aluno a = new Aluno("Joao","joao@gamil.com", 27, "5623", "01/03/2021", "Direito");
		System.out.println(a.toString());
		
		Professor prof = new Professor("Paulo Roberto","prof-Paulo@uemg.com", 45, 4500, "Mestre");
		System.out.println(prof.toString());
		
	}

}
