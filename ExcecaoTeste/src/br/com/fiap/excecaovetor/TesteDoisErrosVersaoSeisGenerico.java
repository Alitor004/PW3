package br.com.fiap.excecaovetor;

public class TesteDoisErrosVersaoSeisGenerico {

	public static void main(String[] args) {
		int[] numero = { 2, 4, 8, 16, 32, 64 };
		int[] denom =  { 2, 2, 0,  2,  0 };
		int[] resul =  { 1, 2, 3,  4,  5,  6 };
		for (int i = 0; i < numero.length; i++) {
			try {
				System.out.println("Resultado: " + numero[i] / denom[i]);
				resul[i] = numero[i] / denom[i];
			} catch (ArithmeticException exc) {
				System.out.println("Ocorreu um erro durante a execução do for," 
						+ " pois tentou dividir um número por zero");
			} catch (Throwable exc) {
				System.out.println("Ocorreu um erro.");
			}
		}
		for (int i = 0; i < numero.length; i++) {
			System.out.println(resul[i]);
		}

	}

}
