package br.com.montadoravetor.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.montadoravetor.model.Moto;

public class TesteArryaListMoto {

	public static void main(String[] args) {
		
		Moto moto = new Moto();
		
		moto.setModelo("PCX");
		moto.setPeso(125.56);
		moto.setQuantidadeAdesivos(20);
		
		Moto motoDois = new Moto();
		
		motoDois.setModelo("Honda XRE 300");
		motoDois.setPeso(150.65);
		motoDois.setQuantidadeAdesivos(15);
		
		List<Moto> vetorListaMoto = new ArrayList<Moto>();
		
		vetorListaMoto.add(moto);
		vetorListaMoto.add(motoDois);
		
		for(Moto c : vetorListaMoto ) {
			System.out.println("Modelo: " +c.getModelo() + 
						"\nPeso: " + c.getPeso()+ 
						"\nQuantidade de Adesivos: " + c.getQuantidadeAdesivos() +
						"\n"
						);
			
		}

	}

}
