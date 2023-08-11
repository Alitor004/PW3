package br.com.terceiroprojeto.teste;

public class Teste {

	public static void main(String[] args) {
		// Converções de valores
		
		String teste = "37";
		String testeDois = "20";
		String testeResultado = teste + testeDois;
		System.out.println("A junção do número " + teste + " e do número "  + testeDois  + " é " + testeResultado);
		
		//Agora iremos converter
		String testeTres = "37";
		String testeQuatro = "20";
		int testeTresConvertido = Integer.parseInt(testeTres);
		int testeQuatroConvertido = Integer.parseInt(testeQuatro);
		int testeResultadoDois = testeTresConvertido + testeQuatroConvertido;
		System.out.println("A soma de " + testeTres + " e de " + testeQuatro + " é igual a " + testeResultadoDois);
		
	}

}