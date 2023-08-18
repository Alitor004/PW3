package br.com.montadora.model;

public class Moto extends Veiculo{
	
	private int quantidadeAdesivos;

	public int getQuantidadeAdesivos() {
		return quantidadeAdesivos;
	}

	public void setQuantidadeAdesivos(int quantidadeAdesivos) {
		this.quantidadeAdesivos = quantidadeAdesivos;
	}
	
	public String getMostraAtributos() {
		return "Modelo da moto: " + getModelo() + 
				"\nPeso da moto: " + getPeso() + "Kg" +
				"\nQuantidade de adesivos da moto: " + getQuantidadeAdesivos();
		
	}
	
}
