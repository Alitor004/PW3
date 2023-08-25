package br.com.construtoradois.teste;

import javax.swing.JOptionPane;

import br.com.construtoradois.model.Casa;

public class TesteCasa {

	public static void main(String[] args) {
		
		Casa casa = new Casa();
		
		casa.setNome(JOptionPane.showInputDialog("Digite o nome do proprietário:"));
		casa.setMetrosQuadradosConstruidos(Double.parseDouble(JOptionPane.showInputDialog("Digite os metros quadrados da constrição:")));
		casa.setMetrosQuadradosTerreno(Double.parseDouble(JOptionPane.showInputDialog("Digite os metros quadrados do terreno:")));
		casa.setTipoTelhado(JOptionPane.showInputDialog("Digite o tipo do telhado:"));
		
		casa.mostrarAtribuos();
		
		System.out.println(casa.areanaoConstruida());

	}

}
