package br.com.montadoravetor.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.montadoravetor.model.Carro;

public class TesteArrayList {

	public static void main(String[] args) {
		
		
		Carro carro = new Carro();
		
		carro.setModelo("Civic");
		carro.setPeso(1235.27);
		carro.setQuantidadePortas(4);
		
		Carro carroDois = new Carro();
		
		carroDois.setModelo("HRV");
		carroDois.setPeso(1433.12);
		carroDois.setQuantidadePortas(4);
		
		List<Carro> vetorListaCarro = new ArrayList<Carro>();
		
		vetorListaCarro.add(carro);
		vetorListaCarro.add(carroDois);
		
		for(Carro c : vetorListaCarro ) {
			System.out.println(c.getModelo() + " " +
						c.getPeso()+ " " +
						c.getQuantidadePortas() + " " +
						"\n"
						);
			
		}

	}

}
