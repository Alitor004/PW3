package br.com.aulatresprojetopoo.teste;

import javax.swing.JOptionPane;

import br.com.aulatresprojetopoo.model.Aluno;
import br.com.aulatresprojetopoo.model.Funcionario;
import br.com.aulatresprojetopoo.model.Professor;

public class TesteDois {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		Funcionario funcionario = new Funcionario();

		/*
		 * aluno.setNome("Alex"); 
		 * aluno.setIdade(19); 
		 * aluno.setRm(222782);
		 */

		aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno:"));
		aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno:")));
		aluno.setRm(Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do aluno:")));

		/*
		 * professor.setNome("Ronqui"); 
		 * professor.setIdade(37);
		 * professor.setSalario(15.235); 
		 * professor.setMateria("Programação Web");
		 */

		professor.setNome(JOptionPane.showInputDialog("Digite o nome do professor:"));
		professor.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do professor:")));
		professor.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do professor:")));
		professor.setMateria(JOptionPane.showInputDialog("Digite a materia do professor:"));

		/*
		 * funcionario.setNome("Garcias"); 
		 * funcionario.setIdade(34);
		 * funcionario.setSetor("Limpeza"); 
		 * funcionario.setSalario(4.365);
		 */

		funcionario.setNome(JOptionPane.showInputDialog("Digite o nome do funcionario:"));
		funcionario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcionario:")));
		funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do funcionario:")));
		funcionario.setSetor(JOptionPane.showInputDialog("Digite o setor do funcionario:"));

		System.out.println("Nome do aluno: " + aluno.getNome() + 
				"\nIdade do aluno: " + aluno.getIdade() + 
				"\nRM do aluno: " + aluno.getRm()
				);

		System.out.println("\nNome do professor: " + professor.getNome() + 
				"\nIdade do professor: " + professor.getIdade() + 
				"\nMateria do professor: " + professor.getMateria()+ 
				"\nSalario do professor: " + professor.getSalario()
				);

		System.out.println("\nNome do funcionario: " + funcionario.getNome() + 
				"\nIdade do funcionario: " + funcionario.getIdade() + 
				"\nSetor do funcionario: " + funcionario.getSetor() + 
				"\nSalario do funcionario: " + funcionario.getSalario()
				);
	}

}
