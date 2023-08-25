package br.com.fabricadoce.model;

public class Brigadeiro extends Doce{
	
	private double pesoChocolate;

	public double getPesoChocolate() {
		return pesoChocolate;
	}

	public void setPesoChocolate(double pesoChocolate) {
		this.pesoChocolate = pesoChocolate;
	}
	
	//Retorne SYSOU
	public void retornarDadosString () {
		
		System.out.println("O nome do Doce: " + getNomeDoce()
		+ "\nO peso do açucar: " + getPesoAcucar()
		+ "\nO peso do Chocolate: " + getPesoChocolate()
		);
	}
	
	//Retorne Valor
	public String retornarDadosStringReturn() {
		return "O nome do Doce: "+ getNomeDoce()
		+ "\nO peso do açucar: " + getPesoAcucar()
		+ "\nO peso do Chocolate: " + getPesoChocolate();
	}
	
	public double retornarPesoTotal() {
		double pesoTotal = getPesoAcucar() + getPesoChocolate();
		return pesoTotal;
	}
}
