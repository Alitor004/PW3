package br.com.escolaarq.arquivo;


public class LerArquivo {

	public static void main(String[] args) {
		
		String ArqConfig = "Conexao.con";
		
		String conteudo = Arquivo.Read(ArqConfig);
		String c1 = conteudo.split(";")[0];
		String c2 = conteudo.split(";")[1];
		
		System.out.println("Login: " + c1);
		System.out.println("Senha: " + c2);

	}

}
