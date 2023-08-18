package br.com.montadora.teste;

import javax.swing.JOptionPane;

import br.com.montadora.model.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro =  new Carro();
		
		carro.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro:"));
		carro.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do carro:")));
		carro.setQuantidadePortas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de portas que tem o carro:")));
		
		/*System.out.println("Modelo do carro: " + carro.getModelo() + 
		*		"\nPeso do carro: " + carro.getPeso() + "Kg" + 
		*		"\nQuantidade de portas do carro: " + carro.getQuantidadePortas()
				);*/
		
		System.out.println(carro.getMostraAtributos());
	}

}
