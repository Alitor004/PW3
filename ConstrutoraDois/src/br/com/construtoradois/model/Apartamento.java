package br.com.construtoradois.model;

public class Apartamento extends Residencia{
	
	private int andar;

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}
	
	public void mostrarAtributor() {
		System.out.println("Esta no nome de: " + getNome() 
				+ "\nMetros quadrados da construção: " + getMetrosQuadradosConstruidos() 
				+ "\nMetros quadrados do terreno: " + getMetrosQuadradosTerreno()
				+ "\nAndar: N°" + getAndar());
	}
}
