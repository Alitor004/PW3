package br.com.motorola.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.motorola.model.Celular;

public class CelularDAO {
	
	private Connection con = null;

	
	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
	public CelularDAO (Connection con) {
		setCon(con);
	}
	
	public String inserir(Celular celular) {
		String sql = "insert into celular(gomesModelo, gomesPeso, gomesAlturaTela, gomesLargura) values (?,?,?,?)";
		try {
			PreparedStatement cl = getCon().prepareStatement(sql);
			cl.setString(1,  celular.getGomesModelo());
			cl.setInt(2, celular.getGomesPeso());
			cl.setInt(3, celular.getGomesAlturaTela());
			cl.setInt(4, celular.getGomesLargura());
			if (cl.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	//Método deletar sem where
	public String deletar() {
		String sql = "delete from celular";
		try {
			PreparedStatement cl = getCon().prepareStatement(sql);
			if (cl.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}


	//Método ALTERAR sem o where
		public String modificar(Celular celular) {
			String sql = "update celular set gomesModelo = ?";
			try {
				PreparedStatement cl = getCon().prepareStatement(sql);
				cl.setString(1,  celular.getGomesModelo());
				if (cl.executeUpdate() > 0) {
					return "Alterado com sucesso";
				} else {
					return "Erro ao modificar";
				}
			} catch (SQLException e) {
				return e.getMessage();
			}
		}

	//Método SELECIONAR sem o where
	public ArrayList<Celular> selecionar() {
		String sql = "select * from celular";
		ArrayList<Celular> retornarCelular = new ArrayList<Celular>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs != null) {
				while(rs.next()) {
					Celular celular = new Celular();
					celular.setGomesModelo(rs.getString(1));
					celular.setGomesPeso(rs.getInt(2));
					celular.setGomesAlturaTela(rs.getInt(3));
					celular.setGomesLargura(rs.getInt(4));
					retornarCelular.add(celular);
				} return retornarCelular;
			} else {
				return null;
			}
		}catch(SQLException e) {
			return null;
		}
	}
}
