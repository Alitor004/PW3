package br.com.projetoteste.teste;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 37;
		String nome = "Rafael Ronqui";
		//Double serve para números decimais
		double salarioDouble = 1233.25555;
		//Float só vai até a quarta casa depois da virgula e arrendonda o último número 
		float salarioFloat = 1233.25555f; 
		
		System.out.println(idade);
		System.out.println(nome);
		System.out.println(salarioDouble);
		System.out.println(salarioFloat);
		System.out.println("Meu nome é " + nome);
		System.out.println("Meu nome é " + nome + " e a idade " + idade);
		System.out.println("Meu nome é " + nome + "\ne a idade " + idade);
	}

}
