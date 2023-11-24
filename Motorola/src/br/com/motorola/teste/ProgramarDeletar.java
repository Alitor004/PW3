package br.com.motorola.teste;

import java.sql.Connection;

import br.com.motorola.conexao.Conexao;
import br.com.motorola.dao.CelularDAO;

public class ProgramarDeletar {

	public static void main(String[] args) {
		Connection con = Conexao.abrirConexao();

		CelularDAO celulardao = new CelularDAO(con);////////

		System.out.println(celulardao.deletar());

		Conexao.fecharConexao(con);

	}

}
