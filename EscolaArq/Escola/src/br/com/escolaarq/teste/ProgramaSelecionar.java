package br.com.escolaarq.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.escolaarq.conexao.Conexao;
import br.com.escolaarq.dao.ProfessorDAO;
import br.com.escolaarq.model.Professor;

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