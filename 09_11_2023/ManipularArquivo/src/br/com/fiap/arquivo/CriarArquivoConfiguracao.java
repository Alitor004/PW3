package br.com.fiap.arquivo;

public class CriarArquivoConfiguracao {

	public static void main(String[] args) {
		
		String ArqConfig = "Configuracao_pessoal.con";
		
		String nome = "Alex Vitor";
		String login = "admin";
		String versao = "7.0";
		
		String print = nome+";"+login+";"+versao;
		
		if(Arquivo.Write(ArqConfig,print))
			System.out.println("O arquivo foi salvo com sucesso.");
		else
			System.out.println("Ocorreu erro para salvar o arquivo.");
	}
}

