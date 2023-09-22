package br.com.array.teste;

import javax.swing.JOptionPane;

public class TesteNumero {

	public static void main(String[] args) {
		int[] numero = new int[3];
		
		for (int i = 0; i < 3; i++)
		{
			numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º número")); 
		}
		for (int i = 0; i < 3; i++)
		{
			System.out.println("O " + (i+1) + "º número: " + numero[i]);
		}

	}

}
