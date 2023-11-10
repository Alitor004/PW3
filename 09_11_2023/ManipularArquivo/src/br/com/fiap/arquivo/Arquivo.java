package br.com.fiap.arquivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {

	//M�todo para ler em um arquivo
	public static String Read(String Caminho) {
		String conteudo = "";
		try {
			FileReader arq = new FileReader(Caminho);
			BufferedReader lerArq = new BufferedReader (arq);
			String linha ="";
			try {
				linha = lerArq.readLine();
				while(linha!=null) {
					conteudo += linha+"\r\n";
					linha = lerArq.readLine();
				}
				arq.close();
				
			} catch (IOException ex) {
				System.out.println("Erro ao tentar ler o arquivo.");
				return "Erro ao tentar ler o arquivo.";
			}
		} catch (FileNotFoundException ex) {
			System.out.println("Erro, pois o arquivo n�o foi encontrado.");
			return "Erro, pois o arquivo n�o foi encontrado.";
		}
		if(conteudo.contains("Erro"))
			return "";
		else {
			return conteudo;
				}
	}
	
	
	//M�todo para escrever em um arquivo
	public static boolean Write(String Caminho, String Texto) {
		try {
			FileWriter arq = new FileWriter(Caminho);
			PrintWriter gravarArq = new PrintWriter(arq);
			gravarArq.println(Texto);
			gravarArq.close();
			return true;
		}catch(IOException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
}

