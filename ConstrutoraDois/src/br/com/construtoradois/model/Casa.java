package br.com.construtoradois.model;

public class Casa extends Residencia{
	
	private String tipoTelhado;

	public String getTipoTelhado() {
		return tipoTelhado;
	}

	public void setTipoTelhado(String tipoTelhado) {
		this.tipoTelhado = tipoTelhado;
	}
	public void mostrarAtribuos() {
		System.out.println("Esta no nome de: " + getNome() 
		+ "\nMetros quadrados da construção: " + getMetrosQuadradosConstruidos() 
		+ "\nMetros quadrados do terreno: " + getMetrosQuadradosTerreno()
		+ "\nTipo de telhado: " + getTipoTelhado());
	}
	
	public double areanaoConstruida() {
		double area = getMetrosQuadradosTerreno() - getMetrosQuadradosConstruidos();
		return area;
	}
}
