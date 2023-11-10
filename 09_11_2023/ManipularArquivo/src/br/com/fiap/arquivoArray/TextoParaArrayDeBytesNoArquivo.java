package br.com.fiap.arquivoArray;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextoParaArrayDeBytesNoArquivo {

	public static void main(String[] args) {
		
		
		Path caminho = Paths.get("C:/Users/rafae/Desktop/arquivo/ArquivoTeste.txt");
		String texto = "Texto que será inserido dentro do arquivo.";
		byte[] textoConvertidoEmByte = texto.getBytes();
		try {
			Files.write(caminho, textoConvertidoEmByte);
			System.out.println("Arquivo criado com sucesso.");
		}catch(Exception erro) {
			System.out.println(erro);
		}
	}
}

