package br.com.fabricaveiculo.model;

public class Carro extends Veiculo {
	
	private int quantidadePortas;
	private double pesoEngate;
	
	
	public int getQuantidadePortas() {
		return quantidadePortas;
	}
	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	public double getPesoEngate() {
		return pesoEngate;
	}
	public void setPesoEngate(double pesoEngate) {
		this.pesoEngate = pesoEngate;
	}
	
	public void mostrarAtributos() {
		System.out.println("O modelo do carro: " + getModelo()
				+ "\nO peso: " + getPeso()
				+ "\nA quantidade de portas: " + getQuantidadePortas()
				+ "\nO peso do engate: " + getPesoEngate());
	}
	
	public double retornarPesoTotal() {
		double pesoTotal = getPeso() + getPesoEngate();
		return pesoTotal;
	}

}
