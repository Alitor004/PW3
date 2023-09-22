package br.com.array.teste;

import javax.swing.JOptionPane;

public class TesteNome {

	public static void main(String[] args) {
		String[] nome = new String[3];
		
		for (int i = 0; i < 3; i++)
		{
			nome[i] = JOptionPane.showInputDialog("Digite o "+(i+1)+"º nome"); 
		}
		for (int i = 0; i < 3; i++)
		{
			System.out.println("O " + (i+1) + "º nome: " + nome[i]);
		}

	}

}
