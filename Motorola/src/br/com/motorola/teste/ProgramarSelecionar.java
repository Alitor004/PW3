package br.com.motorola.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.motorola.conexao.Conexao;
import br.com.motorola.dao.CelularDAO;
import br.com.motorola.model.Celular;

public class ProgramarSelecionar {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();
		CelularDAO celulardao = new CelularDAO(con);////////
		
		ArrayList<Celular> lista = celulardao.selecionar();
		
		if(lista != null) {
			for(Celular celular : lista) {
				System.out.println("Nome do modelo: " + celular.getGomesModelo());
				System.out.println("Peso: " + celular.getGomesPeso());
				System.out.println("Altura da tela:  " + celular.getGomesAlturaTela());
				System.out.println("Largura: " + celular.getGomesLargura() +"\n");
			}
		}

	}

}
