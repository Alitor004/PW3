package br.com.fabricadoce.teste;

import javax.swing.JOptionPane;

import br.com.fabricadoce.model.Brigadeiro;

public class Teste {

	public static void main(String[] args) {
		
		Brigadeiro brigadeiro = new Brigadeiro();
		
		/*brigadeiro.setNomeDoce(JOptionPane.showInputDialog("Digite o nome do Doce:"));
		*brigadeiro.setPesoAcucar(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do açucar:")));
		*brigadeiro.setPesoChocolate(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do chocolate:")));
		*/
		brigadeiro.setNomeDoce("Brigadeiro da vovó");
		brigadeiro.setPesoAcucar(100);
		brigadeiro.setPesoChocolate(700);
		
		/*System.out.println("O nome do Doce: " + brigadeiro.getNomeDoce()
		*		+ "\nO peso do açucar: " + brigadeiro.getPesoAcucar()
		*		+ "\nO peso do Chocolate: " + brigadeiro.getPesoChocolate()
		*		);
		*/
		
		//brigadeiro.retornarDadosString();
		
		System.out.println(brigadeiro.retornarDadosStringReturn());
		
		System.out.println(brigadeiro.retornarPesoTotal());
		
	}

}
