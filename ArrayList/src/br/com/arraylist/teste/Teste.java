package br.com.arraylist.teste;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.arraylist.model.Brigadeiro;



public class Teste {

	public static void main(String[] args) {
		Brigadeiro brigadeiro = new Brigadeiro();
		
		brigadeiro.setApelidoBrigadeiro(JOptionPane.showInputDialog("Digite o apelido:"));
		brigadeiro.setPesoChocolate(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do Chocolate:")));
		
		Brigadeiro brigadeiroDois = new Brigadeiro();
		
		brigadeiroDois.setApelidoBrigadeiro(JOptionPane.showInputDialog("Digite o apelido:"));
		brigadeiroDois.setPesoChocolate(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do Chocolate:")));
		
		Brigadeiro brigadeiroTres = new Brigadeiro();
		
		brigadeiroTres.setApelidoBrigadeiro(JOptionPane.showInputDialog("Digite o apelido:"));
		brigadeiroTres.setPesoChocolate(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do Chocolate:")));
		
		List<Brigadeiro> vetorListaBrigadeiro = new ArrayList<Brigadeiro>();
		
		vetorListaBrigadeiro.add(brigadeiro);
		vetorListaBrigadeiro.add(brigadeiroDois);
		vetorListaBrigadeiro.add(brigadeiroTres);
		
		for(Brigadeiro c : vetorListaBrigadeiro ) {
			System.out.println("Apelido: " +c.getApelidoBrigadeiro() + 
						"\nPeso do chocolate: " + c.getPesoChocolate() + 
						"\n"
						);
			
		}

	}

}
