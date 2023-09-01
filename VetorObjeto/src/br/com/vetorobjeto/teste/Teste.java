package br.com.vetorobjeto.teste;

import javax.swing.JOptionPane;

import br.com.vetorobjeto.model.Aluno;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setNome("Alex");
		aluno.setIdade(19);
		aluno.setRm(222187);
		
		Aluno[] alunoVetor = new Aluno[3];
		
		/*
		alunoVetor[0] = new Aluno();
		alunoVetor[0].setNome("Alex");
		alunoVetor[0].setIdade(19);
		alunoVetor[0].setRm(222187);
		*/
		
		String nome = "";
		int idade = 0;
		int rm = 0;
		
		for(int i=0; i<3; i++)
		{
			nome = JOptionPane.showInputDialog("Digite o nome do "+(i+1)+"° Aluno");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do "+(i+1)+"° Aluno"));
			rm = Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do "+(i+1)+"° Aluno"));
			
			alunoVetor[i] = new Aluno();
			/*
			alunoVetor[i].setNome(JOptionPane.showInputDialog("Digite o nome do "+(i+1)+"° Aluno"));
			alunoVetor[i].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do "+(i+1)+"° Aluno")));
			alunoVetor[i].setRm(Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do "+(i+1)+"° Aluno")));
			*/
			alunoVetor[i].setNome(nome);
			alunoVetor[i].setIdade(idade);
			alunoVetor[i].setRm(rm);
		}
		
		//for para mostrar os tres objetos
		for(int i=0; i<3; i++)
		{
			System.out.println("Nome: "+alunoVetor[i].getNome()
					+ "\nIdade: "+alunoVetor[i].getIdade()
					+ "\nRM: "+alunoVetor[i].getRm() + "\n\n"
					);
		}
		
		
		
	}

}
