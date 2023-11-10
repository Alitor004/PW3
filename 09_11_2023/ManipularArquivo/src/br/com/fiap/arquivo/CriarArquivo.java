package br.com.fiap.arquivo;

public class CriarArquivo {

	public static void main(String[] args) {
		
		String arq = "ArquivoCriadoTres.txt";
		
		 //Grava��o de arquivo
		String texto = "Texto de teste para inserir no arquivo. \r\n"
				+ "Inserindo quebra de linha.";
		
		if(Arquivo.Write(arq,texto))
			System.out.println("O arquivo foi salvo com sucesso.");
		else
			System.out.println("Ocorreu erro para salvar o arquivo.");
	}
}

