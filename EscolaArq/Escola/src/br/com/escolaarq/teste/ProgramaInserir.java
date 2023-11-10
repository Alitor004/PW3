package br.com.escolaarq.teste;

import java.sql.Connection;

import br.com.escolaarq.conexao.Conexao;
import br.com.escolaarq.dao.ProfessorDAO;
import br.com.escolaarq.model.Professor;

public class ProgramaInserir {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Professor professor = new Professor();
		ProfessorDAO professordao = new ProfessorDAO(con);////////
		
		professor.setNome("Alex");
		professor.setCurso("Java");
		professor.setSalario(15000);
		System.out.println(professordao.inserir(professor));
		
		Conexao.fecharConexao(con);
	}

}
