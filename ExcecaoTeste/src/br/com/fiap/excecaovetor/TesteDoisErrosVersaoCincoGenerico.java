package br.com.fiap.excecaovetor;

public class TesteDoisErrosVersaoCincoGenerico {

	public static void main(String[] args) {
		int[] numero = { 2, 4, 8, 16, 32, 64 };
		int[] denom =  { 2, 2, 0,  2,  0 };
		
		for (int i = 0; i < numero.length; i++) {
			try {
				System.out.println("Resultado: " + numero[i] / denom[i]);
			} catch (ArithmeticException exc) {
				System.out.println("Ocorreu um erro durante a execução do for," 
						+ " pois tentou dividir um número por zero");
			} catch (Throwable exc) { // Throwable é a superclasse que captura todos os erros e exceções no Java
				System.out.println("Ocorreu um erro.");
			}
		}

	}

}
