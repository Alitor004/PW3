package br.com.primeirovetor.teste;

public class Teste {

	public static void main(String[] args) {
		
		int idade = 19;
		int idadeDois = 17;
		int idadeTres = 27;
		
		int [] idadeVetor = new int[3];
		
		idadeVetor[0] = 19;
		idadeVetor[1] = 17;
		idadeVetor[2] = 27;
		
		System.out.println(idadeVetor[0]);
		
		//Vetor String com o nome nomeVetor de 3 posições
		
		String [] nomeVetor = new String[3];
				
		nomeVetor[0] = "Alex";
		nomeVetor[1] = "Vanderley";
		nomeVetor[2] = "Nana";
		
		System.out.println(nomeVetor[0]);
		
		
		//Esta errado, esta é a ideia do TypeScript
		/*Pessoas[] pessoasVetor = new Pessoas[3];
		 * 
		 *  pessoasVetor[0] = {nome = "Alex", idade = 19, peso = 79.8};
		 *  pessoasVetor[1] = {nome = "Vanderley", idade = 17, peso = 70.0};
		 *  pessoasVetor[2] = {nome = "Nana", idade = 27, peso = 58.6};
		 */

	}

}
