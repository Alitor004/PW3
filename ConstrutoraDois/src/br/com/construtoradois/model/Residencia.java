package br.com.construtoradois.model;

public class Residencia {
	
	private String nome;
	private double metrosQuadradosConstruidos;
	private double metrosQuadradosTerreno;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getMetrosQuadradosConstruidos() {
		return metrosQuadradosConstruidos;
	}
	public void setMetrosQuadradosConstruidos(double metrosQuadradosConstruidos) {
		this.metrosQuadradosConstruidos = metrosQuadradosConstruidos;
	}
	public double getMetrosQuadradosTerreno() {
		return metrosQuadradosTerreno;
	}
	public void setMetrosQuadradosTerreno(double metrosQuadradosTerreno) {
		this.metrosQuadradosTerreno = metrosQuadradosTerreno;
	}
}
