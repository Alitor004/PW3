package br.com.fiap.arquivo;

public class LerArquivo {

	public static void main(String[] args) {
		
		String arq = "ArquivoCriado.txt";
		
		String texto = Arquivo.Read(arq);
		if(texto.isEmpty())
			System.out.println("Ocorreu erro ao ler a arquivo.");
		else
			System.out.println(texto);
		System.out.println("oi");
		double ddd = 13;
		System.out.println(ddd);
	}
	
	
}


