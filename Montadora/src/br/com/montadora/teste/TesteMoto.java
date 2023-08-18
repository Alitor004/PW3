package br.com.montadora.teste;

import javax.swing.JOptionPane;

import br.com.montadora.model.Moto;


public class TesteMoto {

	public static void main(String[] args) {
		
		Moto moto =  new Moto();
		
		moto.setModelo(JOptionPane.showInputDialog("Digite o modelo da moto:"));
		moto.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da moto:")));
		moto.setQuantidadeAdesivos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de adesivos que tem a moto:")));
		
		/*System.out.println("Modelo da moto: " + carro.getModelo() + 
		*		"\nPeso da moto: " + carro.getPeso() + "Kg" +
		*		"\nQuantidade de adesivos da moto: " + carro.getQuantidadeAdesivos()
				);*/
		
		System.out.println(moto.getMostraAtributos());

	}

}
