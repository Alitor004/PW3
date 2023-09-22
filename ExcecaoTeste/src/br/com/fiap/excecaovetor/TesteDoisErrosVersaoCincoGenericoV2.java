package br.com.fiap.excecaovetor;

public class TesteDoisErrosVersaoCincoGenericoV2 {

	public static void main(String[] args) {
		int[] numero = { 2, 4, 8, 16, 32, 64 };
		int[] denom = { 2, 2, 0, 2, 0 };
		for (int i = 0; i < numero.length; i++) {
			try {
				System.out.println("Resultado: " + numero[i] / denom[i]);
			} catch (Throwable exc) {
				System.out.println("Ocorreu um erro.");
			} catch (ArithmeticException exc) { //Para o Java o correto primeiro é colocar a busca dos erros específicos e depois os genéricos (Throwable).
				System.out.println("Ocorreu um erro durante a execução do for," 
						+ " pois tentou dividir um número por zero");
			}
		}

	}

}
