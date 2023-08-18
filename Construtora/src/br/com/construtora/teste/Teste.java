package br.com.construtora.teste;

import javax.swing.JOptionPane;

import br.com.construtora.model.Casa;

public class Teste {

	public static void main(String[] args) {
		
		Casa casa = new Casa();
		
		casa.setMetrosQuadrados(Double.parseDouble(JOptionPane.showInputDialog("Digite quantos metros quadrados tem a casa:")));
		casa.setTamanhoPortaoMetrosQuadrados(Double.parseDouble(JOptionPane.showInputDialog("Digite quantos metros quadrados tem a posta da casa:")));
		
		/*System.out.println("A casa tem: " + casa.getMetrosQuadrados() + "m^2" +
		*		"\nO tamanho dos postões da casa tem: " + casa.getTamanhoPortaoMetrosQuadrados() + "m^2"
				);*/
		
		System.out.println(casa.getMostraAtributos());
	}

}
