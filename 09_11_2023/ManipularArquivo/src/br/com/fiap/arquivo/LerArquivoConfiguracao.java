 package br.com.fiap.arquivo;

public class LerArquivoConfiguracao {

	public static void main(String[] args) {
		
		String ArqConfig = "Configuracao_pessoal.con";
		
		String conteudo = Arquivo.Read(ArqConfig);
		String c1 = conteudo.split(";")[0];
		String c2 = conteudo.split(";")[1];
		String c3 = conteudo.split(";")[2];
		
		System.out.println("Nome: " + c1);
		System.out.println("Login: " + c2);
		System.out.println("Senha: " + c3);
	}
}

