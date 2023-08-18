package br.com.zoologico.teste;

import br.com.zoologico.model.Mamifero;
import br.com.zoologico.model.Reptil;

public class Teste {

	public static void main(String[] args) {
		
		//Mamifero
		
		Mamifero mamifero = new Mamifero();
		
		mamifero.setNome("Kira");
		mamifero.setPeso(16.5);
		mamifero.setTempoGestacao(9);
		
		System.out.println("Nome do mamifero: " + mamifero.getNome() +
				"\nPeso do mamifero: " + mamifero.getPeso() +
				"\nTempo de gestação: " + mamifero.getTempoGestacao()
				);
		
		//Instanciar Reptil
		
		Reptil reptil = new Reptil();
		
		reptil.setNome("Edem");
		reptil.setPeso(10);
		reptil.setCorPricipalPele("Amarelo");
		
		System.out.println("\nNome do réptil: " + reptil.getNome() +
				"\nPeso do réptil: " + reptil.getPeso() +
				"\nTCor de pele do réptil: " + reptil.getCorPricipalPele()
				);
	}

}
