package br.com.aulatresprojetopoo.teste;

import br.com.aulatresprojetopoo.model.Aluno;
import br.com.aulatresprojetopoo.model.Funcionario;
import br.com.aulatresprojetopoo.model.Professor;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		Funcionario funcionario = new Funcionario();

		aluno.setNome("Alex");
		aluno.setIdade(19);
		aluno.setRm(222782);
		
		professor.setNome("Ronqui");
		professor.setIdade(37);
		professor.setSalario(15.235);
		professor.setMateria("Programação Web");

		funcionario.setNome("Garcias");
		funcionario.setIdade(34);
		funcionario.setSetor("Limpeza");
		funcionario.setSalario(4.365);
		

		System.out.println("Nome do aluno: " + aluno.getNome() + 
				"\nIdade do aluno: " + aluno.getIdade()+ 
				"\nRM do aluno: " + aluno.getRm()
				);

		System.out.println("\nNome do professor: " + professor.getNome() + 
				"\nIdade do professor: " + professor.getIdade() + 
				"\nMateria do professor: " + professor.getMateria()+ 
				"\nSalario do professor: " + professor.getSalario()
				);

		System.out.println("\nNome do funcionario: " + funcionario.getNome() + 
				"\nIdade do funcionario: " + funcionario.getIdade() + 
				"\nSetor do funcionario: " + funcionario.getSetor()+ 
				"\nSalario do funcionario: " + funcionario.getSalario()
				);
	}

}
