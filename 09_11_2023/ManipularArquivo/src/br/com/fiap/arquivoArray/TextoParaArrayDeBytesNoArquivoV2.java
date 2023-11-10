package br.com.fiap.arquivoArray;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class TextoParaArrayDeBytesNoArquivoV2 {

	public static void main(String[] args) {
		
		Path caminho = Paths.get("C:/Users/rafae/Desktop/arquivo/ArquivoTesteTextoRecebido.txt");
		String texto = JOptionPane.showInputDialog("Digite o texto que você quer colocar no arquivo.");
		byte[] textoConvertidoEmByte = texto.getBytes();
		try {
			Files.write(caminho, textoConvertidoEmByte);
			System.out.println("Arquivo criado com sucesso.");
		}catch(Exception erro) {
			System.out.println(erro);
		}
	}
}

