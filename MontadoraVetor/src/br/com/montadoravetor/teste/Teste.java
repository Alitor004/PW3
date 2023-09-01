package br.com.montadoravetor.teste;

import javax.swing.JOptionPane;

import br.com.montadoravetor.model.Carro;

public class Teste {

	public static void main(String[] args) {
		Carro[] vetorCarro = new Carro[3];
		
		for(int i=0; i<3; i++)
		{
			vetorCarro[i] = new Carro();
			vetorCarro[i].setModelo(JOptionPane.showInputDialog("Digite o modelo do "+(i+1)+"° Carro"));
			vetorCarro[i].setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do "+(i+1)+"° Carro")));
			vetorCarro[i].setQuantidadePortas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de portas do "+(i+1)+"° Carro")));
			
		}
		
		for(int i=0; i<3; i++)
		{
			System.out.println("Modelo: "+vetorCarro[i].getModelo()
					+ "\nPeso: "+vetorCarro[i].getPeso()
					+ "\nQuantidade de Portas: "+vetorCarro[i].getQuantidadePortas() 
					+ "\n\n"
					);
		}

	}

}
