package br.com.fabricaveiculo.teste;

import br.com.fabricaveiculo.model.Carro;

public class Teste {

	public static void main(String[] args) {
		 Carro carro = new Carro();
		 
		 carro.setModelo("Uno");
		 carro.setPeso(1200);
		 carro.setPesoEngate(300);
		 carro.setQuantidadePortas(5);
		 
		 carro.mostrarAtributos();
		 System.out.println("Pesso total: "+carro.retornarPesoTotal());

	}

}
