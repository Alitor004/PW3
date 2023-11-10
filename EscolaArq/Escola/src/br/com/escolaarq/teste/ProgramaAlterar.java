package br.com.escolaarq.teste;

import java.sql.Connection;

import br.com.escolaarq.conexao.Conexao;
import br.com.escolaarq.dao.ProfessorDAO;
import br.com.escolaarq.model.Professor;

public class ProgramaAlterar {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Professor professor = new Professor();
		ProfessorDAO professordao = new ProfessorDAO(con);
		
		professor.setCurso("Mobile");
		professor.setNome("Guilherme");
		System.out.println(professordao.modificar(professor));
		
		Conexao.fecharConexao(con);

	}

}
