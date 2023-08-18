package br.com.montadora.model;

public class Carro extends Veiculo{
	
	private int quantidadePortas;

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	} 
	
	public String getMostraAtributos() {
		return "Modelo da moto: " + getModelo() + 
				"\nPeso da moto: " + getPeso() + "Kg" +
				"\nQuantidade de adesivos da moto: " + getQuantidadePortas();
		
	}
}
