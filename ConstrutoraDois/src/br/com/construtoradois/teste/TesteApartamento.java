package br.com.construtoradois.teste;

import javax.swing.JOptionPane;

import br.com.construtoradois.model.Apartamento;

public class TesteApartamento {

	public static void main(String[] args) {
		Apartamento apartamento = new Apartamento();
		
		apartamento.setNome(JOptionPane.showInputDialog("Digite o nome do proprietário:"));
		apartamento.setMetrosQuadradosConstruidos(Double.parseDouble(JOptionPane.showInputDialog("Digite os metros quadrados da constrição:")));
		apartamento.setMetrosQuadradosTerreno(Double.parseDouble(JOptionPane.showInputDialog("Digite os metros quadrados do terreno:")));
		apartamento.setAndar(Integer.parseInt(JOptionPane.showInputDialog("Digite o andar:")));

		
		apartamento.mostrarAtributor();
	}

}
