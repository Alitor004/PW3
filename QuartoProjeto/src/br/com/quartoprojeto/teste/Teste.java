package br.com.quartoprojeto.teste;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		String nomeProfessor = "Rafael Ronqui";
		
		String nomeAluno = JOptionPane.showInputDialog("Digite seu nome");
		
		System.out.println(nomeAluno);
	}

}