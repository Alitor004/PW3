package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Endereco;

public class CepDAO {
	
	private Connection con = null;

	
	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
	public CepDAO (Connection con) {
		setCon(con);
	}
	
	public String inserir(Endereco endereco) {
		String sql = "insert into Endereco(cep, logradouro, complemento, bairro, localidade, uf, ibge, gia, ddd, siafi) values (?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ed = getCon().prepareStatement(sql);
			ed.setString(1,  endereco.getCep());
			ed.setString(2,  endereco.getLogradouro());
			ed.setString(3,  endereco.getComplemento());
			ed.setString(4,  endereco.getBairro());
			ed.setString(5,  endereco.getLocalidade());
			ed.setString(6,  endereco.getUf());
			ed.setString(7,  endereco.getIbge());
			ed.setString(8,  endereco.getGia());
			ed.setString(9,  endereco.getDdd());
			ed.setString(10,  endereco.getSiafi());
			
			if(ed.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
}
