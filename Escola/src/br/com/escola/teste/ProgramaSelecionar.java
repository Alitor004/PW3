package br.com.escola.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.escola.conexao.Conexao;
import br.com.escola.dao.ProfessorDAO;
import br.com.escola.model.Professor;

public class ProgramaSelecionar {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();
		ProfessorDAO professordao = new ProfessorDAO(con);
		
		ArrayList<Professor> lista = professordao.retornarDados();
		
		if(lista != null) {
			for(Professor professor : lista) {
				System.out.println("Nome do professor " + professor.getNome());
				System.out.println("Nome do curso " + professor.getCurso());
				System.out.println("Salario do professor " + professor.getSalario() + "\n");
			}
		}
		
		Conexao.fecharConexao(con);

	}

}