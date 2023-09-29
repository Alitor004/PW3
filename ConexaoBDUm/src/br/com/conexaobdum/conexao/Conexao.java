package br.com.conexaobdum.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	
	public Connection getConnection() throws SQLException {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexao = null;
			String url = "jdbc:mysql://localhost/xe?useSSL=false";
			conexao = DriverManager.getConnection(url, "root", "*123456HAS*");
			System.out.println("Funcionou");
			return conexao;
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getMessage());
		}
	}
}
