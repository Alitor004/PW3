package br.com.escola.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.escola.model.Professor;

public class ProfessorDAO {
	
	private Connection con = null;

	
	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
	public ProfessorDAO(Connection con) {
		setCon(con);
	}
	
	public String inserir(Professor professor) {
		String sql = "insert into professor(nome, curso, salario) values (?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1,  professor.getNome());
			ps.setString(2, professor.getCurso());
			ps.setDouble(3, professor.getSalario());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	//Método deletar
	
	public String deletar(Professor professor) {
		String sql = "delete from professor where curso = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1,  professor.getCurso());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	//Métodoi deletar com o where no nome
	public String deletarWhereNome(Professor professor) {
		String sql = "delete from professor where nome = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1,  professor.getNome());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	//Método deletar sem where
	
	public String deletarSemWhere() {
		String sql = "delete from professor";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
}
