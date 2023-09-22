package br.com.fiap.excecaovetor;

public class TesteExcecao {

	public static void main(String[] args) {
		try {
			int[] vetor = new int[3];
			vetor[3] = 1;
			System.out.println("Exceção criada para quando tentar acessar " 
					+ "um índice do vetor que não existe");
		} catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exceção ao acessar um índice do vetor que não existe.");
		}
		System.out.println("Esse texto está após a execução do try e do exception.");
	}

}
