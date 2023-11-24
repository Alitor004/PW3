package br.com.motorola.teste;

import java.sql.Connection;

import br.com.motorola.conexao.Conexao;
import br.com.motorola.dao.CelularDAO;
import br.com.motorola.model.Celular;

public class ProgramaInserir {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Celular celular = new Celular();
		CelularDAO celulardao = new CelularDAO(con);
		
		celular.setGomesModelo("M30");
		celular.setGomesPeso(1);
		celular.setGomesAlturaTela(10);
		celular.setGomesLargura(4);
		System.out.println(celulardao.inserir(celular));
		
		Conexao.fecharConexao(con);

	}

}
