package br.com.escolaarq.teste;

import java.sql.Connection;

import br.com.escolaarq.conexao.Conexao;
import br.com.escolaarq.dao.ProfessorDAO;
import br.com.escolaarq.model.Professor;

public class ProgramaDeletarNome {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Professor professor = new Professor();
		ProfessorDAO professordao = new ProfessorDAO(con);
		
		professor.setNome("Rafael aleluia");
		System.out.println(professordao.deletarWhereNome(professor));
		
		Conexao.fecharConexao(con);

	}

}
