package br.com.aulatresprojetotres.teste;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		int idadePai = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do pai")); 
		int idadeFilho = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do filho"));
		
		double media = (idadePai + idadeFilho) / 2;
		
		if (media > 50) {
			System.out.println("Com certeza o filho é maior de idade.");
		}
		else {
			System.out.println("Talvez o filho é menor de idade.");
		}

	}

}
