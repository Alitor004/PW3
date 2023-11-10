package br.com.escolaarq.arquivo;

public class CriarArquivo {

	public static void main(String[] args) {
		
		String ArqConfig = "Conexao.con";
		
		String login = "root";
		String senha = "*123456HAS*";
		
		String print = login+";"+senha+";";
		
		if(Arquivo.Write(ArqConfig,print))
			System.out.println("O arquivo foi salvo com sucesso.");
		else
			System.out.println("Ocorreu erro para salvar o arquivo.");

	}

}
