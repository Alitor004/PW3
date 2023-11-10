package br.com.escola.teste;

import java.sql.Connection;

import br.com.escola.conexao.Conexao;
import br.com.escola.dao.ProfessorDAO;
import br.com.escola.model.Professor;

public class ProgramaInserir {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Professor professor = new Professor();
		ProfessorDAO professordao = new ProfessorDAO(con);////////
		
		professor.setNome("Edson de Oliveira");
		professor.setCurso("ADM");
		professor.setSalario(15000);
		System.out.println(professordao.inserir(professor));
		
		Conexao.fecharConexao(con);
	}

}
