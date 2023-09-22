package br.com.fiap.excecaovetor;

public class TesteDoisErrosVersaoQuatro {

	public static void main(String[] args) {
		int[] numero = { 2, 4, 8, 16, 32, 64 };
		int[] denom =  { 2, 2, 0,  2,  0 };
		
		for (int i = 0; i < numero.length; i++) {
			try {
				System.out.println("Resultado: " + numero[i] / denom[i]);
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException exc) {
				System.out.println("Aconteceu um erro.");
			}
		}

	}

}
