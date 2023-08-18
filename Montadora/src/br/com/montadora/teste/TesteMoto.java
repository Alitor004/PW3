package br.com.montadora.teste;

import javax.swing.JOptionPane;

import br.com.montadora.model.Moto;


public class TesteMoto {

	public static void main(String[] args) {
		
		Moto carro =  new Moto();
		
		carro.setModelo(JOptionPane.showInputDialog("Digite o modelo da moto:"));
		carro.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da moto:")));
		carro.setQuantidadeAdesivos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de adesivos que tem a moto:")));
		
		System.out.println("Modelo da moto: " + carro.getModelo() + 
				"\nPeso da moto: " + carro.getPeso() + "Kg" +
				"\nQuantidade de adesivos da moto: " + carro.getQuantidadeAdesivos()
				);

	}

}
