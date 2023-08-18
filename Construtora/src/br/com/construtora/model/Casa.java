package br.com.construtora.model;

public class Casa extends Residencia{
	
	private double tamanhoPortaoMetrosQuadrados;

	public double getTamanhoPortaoMetrosQuadrados() {
		return tamanhoPortaoMetrosQuadrados;
	}

	public void setTamanhoPortaoMetrosQuadrados(double tamanhoPortaoMetrosQuadrados) {
		this.tamanhoPortaoMetrosQuadrados = tamanhoPortaoMetrosQuadrados;
	}
	
	public String getMostraAtributos() {
		return "A casa tem: " + getMetrosQuadrados() + "m^2" +
				"\nO tamanho dos postões da casa tem: " + getTamanhoPortaoMetrosQuadrados() + "m^2";
	}

}
