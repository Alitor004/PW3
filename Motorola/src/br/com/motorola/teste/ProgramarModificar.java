package br.com.motorola.teste;

import java.sql.Connection;

import br.com.motorola.conexao.Conexao;
import br.com.motorola.dao.CelularDAO;
import br.com.motorola.model.Celular;

public class ProgramarModificar {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Celular celular = new Celular();
		CelularDAO celulardao = new CelularDAO(con);

		celular.setGomesModelo("M25");
		System.out.println(celulardao.modificar(celular));

		Conexao.fecharConexao(con);

	}

}
