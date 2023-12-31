package br.com.zoologico.teste;

import javax.swing.JOptionPane;

import br.com.zoologico.model.Mamifero;
import br.com.zoologico.model.Reptil;

public class TesteDois {

	public static void main(String[] args) {
		//Mamifero
		
		Mamifero mamifero = new Mamifero();
		
		/*mamifero.setNome("Kira");
		mamifero.setPeso(16.5);
		mamifero.setTempoGestacao(9);*/
		
		mamifero.setNome(JOptionPane.showInputDialog("Digite o nome do mamifero:"));
		mamifero.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do mamifero:")));
		mamifero.setTempoGestacao(Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de gestação do mamifero:")));
		
		System.out.println("Nome do mamifero: " + mamifero.getNome() +
				"\nPeso do mamifero: " + mamifero.getPeso() +
				"\nTempo de gestação: " + mamifero.getTempoGestacao()
				);
		
		//Instanciar Reptil
		
		Reptil reptil = new Reptil();
		
		/*reptil.setNome("Edem");
		reptil.setPeso(10);
		reptil.setCorPricipalPele("Amarelo");*/
		
		reptil.setNome(JOptionPane.showInputDialog("Digite o nome do reptil:"));
		reptil.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do reptil:")));
		reptil.setCorPricipalPele(JOptionPane.showInputDialog("Digite a cor de pele do reptil:"));
		
		System.out.println("\nNome do réptil: " + reptil.getNome() +
				"\nPeso do réptil: " + reptil.getPeso() +
				"\nTCor de pele do réptil: " + reptil.getCorPricipalPele()
				);

	}

}
